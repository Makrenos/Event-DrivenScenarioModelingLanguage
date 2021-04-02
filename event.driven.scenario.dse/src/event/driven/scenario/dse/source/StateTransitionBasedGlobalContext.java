package event.driven.scenario.dse.source;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.transformation.evm.api.RuleSpecification;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;
import org.eclipse.viatra.transformation.evm.specific.ConflictResolvers;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;


public class StateTransitionBasedGlobalContext{
	

    // **** fields and methods for multi threading *****//
    // *************************************************//

    public enum ExplorationProcessState {
        NOT_STARTED,
        RUNNING,
        STOPPING,
        COMPLETED
    }

    private ConcurrentLinkedQueue<Throwable> exceptions = new ConcurrentLinkedQueue<Throwable>();

    private volatile ExplorationProcessState state = ExplorationProcessState.NOT_STARTED;
    private final Set<StateTransitionBasedExplorerThread> runningThreads = new HashSet<StateTransitionBasedExplorerThread>();
    private StateTransitionBasedDSEThreadPool threadPool = new StateTransitionBasedDSEThreadPool();
    private int numberOfStartedThreads = 0;
    private IDesignSpace designSpace;

    private AtomicBoolean firstThreadContextInited = new AtomicBoolean(false);
    private AtomicBoolean firstThreadContextIniting = new AtomicBoolean(false);

    private Map<RuleSpecification<?>, BatchTransformationRule<?,?>> specificationRuleMap;

    private Object terminationSnycObject = new Object();

    private Logger logger = Logger.getLogger(IStrategy.class);

    private boolean isAlreadyInited;

    public void waitForTermination() {
        synchronized (terminationSnycObject) {
            while (!isDone()) {
                try {
                    terminationSnycObject.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

    /**
     * Starts a new thread to explore the design space.
     * 
     * @param originalThreadContext The context of the thread which starts the new thread.
     * @param model The model to start from.
     * @param cloneModel It should be true in most cases.
     * @param strategy The strategy, the thread will use.
     * @return The {@link ExplorerThread}
     */
    private synchronized StateTransitionBasedExplorerThread tryStartNewThread(StateTransitionBasedThreadContext originalThreadContext, Notifier model,
    		StateTransitionBasedIStrategy strategy) {
        
        if(!isAlreadyInited) {
            isAlreadyInited = true;
            init();
        }

        if (state != ExplorationProcessState.COMPLETED && state != ExplorationProcessState.STOPPING
                && threadPool.canStartNewThread()) {

        	StateTransitionBasedThreadContext newThreadContext = new StateTransitionBasedThreadContext(this, strategy, model);

            // TODO : clone undo list? slave strategy can't go further back...
        	StateTransitionBasedExplorerThread explorerThread = new StateTransitionBasedExplorerThread(newThreadContext);
            newThreadContext.setExplorerThread(explorerThread);

            boolean isSuccessful = threadPool.tryStartNewStrategy(explorerThread);

            if (isSuccessful) {
                runningThreads.add(explorerThread);

                state = ExplorationProcessState.RUNNING;
                ++numberOfStartedThreads;

                logger.info("New thread started, active threads: " + runningThreads.size());

                return explorerThread;
            }
        }
        return null;
    }

    public synchronized StateTransitionBasedExplorerThread tryStartNewThread(StateTransitionBasedThreadContext originalThreadContext, StateTransitionBasedIStrategy strategy) {
        return tryStartNewThread(originalThreadContext, EMFHelper.clone(originalThreadContext.getModel()), strategy);
    }

    public synchronized StateTransitionBasedExplorerThread tryStartNewThreadWithoutModelClone(StateTransitionBasedThreadContext originalThreadContext,
    		StateTransitionBasedIStrategy strategy) {
        return tryStartNewThread(originalThreadContext, originalThreadContext.getModel(), strategy);
    }

    public synchronized StateTransitionBasedExplorerThread startFirstThread(StateTransitionBasedIStrategy strategy, Notifier model) {
        Preconditions.checkState(!isAlreadyInited, "First thread is already started.");
        return tryStartNewThread(null, EMFHelper.clone(model), strategy);
    }

    public synchronized StateTransitionBasedExplorerThread startFirstThreadWithoutModelClone(StateTransitionBasedIStrategy strategy, Notifier model) {
        Preconditions.checkState(!isAlreadyInited, "First thread is already started.");
        return tryStartNewThread(null, model, strategy);
    }
    
    public synchronized void startAllThreads(StateTransitionBasedThreadContext originalThreadContext, StateTransitionBasedIStrategyFactory strategyFactory) {
        while (canStartNewThread()) {
            tryStartNewThread(originalThreadContext, strategyFactory.createStrategy());
        }
    }

    /**
     * Starts a new thread to explore the design space.
     * 
     * @param strategyBase
     *            The {@link Strategy}.
     * @param tedToClone
     *            The model to clone. Hint: context.getTed()
     */

    public synchronized void strategyFinished(StateTransitionBasedExplorerThread strategy) {
        runningThreads.remove(strategy);

        logger.info("Thread finished, active threads: " + runningThreads.size());

        // is the first part necessary?
        if (runningThreads.isEmpty()) {
            state = ExplorationProcessState.COMPLETED;
            threadPool.shutdown();

            // if the main thread (which started the exploration)
            // is waiting for the solution, than wake it up
            synchronized (terminationSnycObject) {
                terminationSnycObject.notify();
                logger.info("Exploration terminated.");
            }

        }
    }

    public synchronized boolean isDone() {
        return state == ExplorationProcessState.COMPLETED && runningThreads.isEmpty();
    }

    public synchronized boolean isNotStarted() {
        return state == ExplorationProcessState.NOT_STARTED;
    }

    public boolean canStartNewThread() {
        return (state == ExplorationProcessState.NOT_STARTED || state == ExplorationProcessState.RUNNING)
                && threadPool.canStartNewThread();
    }

    public synchronized void stopAllThreads() {
        if (state == ExplorationProcessState.RUNNING) {
            state = ExplorationProcessState.STOPPING;
            logger.info("Stopping all threads.");
            for (StateTransitionBasedExplorerThread strategy : runningThreads) {
                strategy.stopRunning();
            }
        }
    }

    public void registerException(Throwable e) {
        exceptions.add(e);
    }

    // ******* fields and methods for exploration *******//
    // **************************************************//

    private List<StateTransitionBasedIObjective> objectives = new ArrayList<StateTransitionBasedIObjective>();
    private StateTransitionBasedIObjective[][] leveledObjectives;
    private List<StateTransitionBasedIGlobalConstraint> globalConstraints = new ArrayList<StateTransitionBasedIGlobalConstraint>();
    private Set<BatchTransformationRule<?, ?>> transformations = new HashSet<BatchTransformationRule<?, ?>>();
    private IStateCoderFactory stateCoderFactory;
    private StateTransitionBasedSolutionStore solutionStore = new StateTransitionBasedSolutionStore(1);
    private Object sharedObject;
    private List<StateTransitionBasedIDesignSpaceVisualizer> visualizers;

    private ConflictResolver conflictResolver = ConflictResolvers.createArbitraryResolver();

    private void init() {
        leveledObjectives = new StateTransitionBasedLeveledObjectiveHelper(objectives).initLeveledObjectives();
        
        specificationRuleMap = new HashMap<>();
        for (BatchTransformationRule<?,?> rule : transformations) {
            specificationRuleMap.put(rule.getRuleSpecification(), rule);
        }
    }

    public List<StateTransitionBasedIDesignSpaceVisualizer> getVisualizers() {
        return ImmutableList.copyOf(visualizers);
    }

    public void registerDesignSpaceVisualizer(StateTransitionBasedIDesignSpaceVisualizer visualizer) {
        if (visualizer == null) {
            return;
        }
        if (visualizers == null) {
            visualizers = new ArrayList<StateTransitionBasedIDesignSpaceVisualizer>();
        }
        visualizers.add(visualizer);
    }

    public void deregisterDesignSpaceVisualizer(StateTransitionBasedIDesignSpaceVisualizer visualizer) {
        if (visualizer == null) {
            return;
        }
        if (visualizers != null) {
            visualizers.remove(visualizer);
        }
    }

    public boolean isDesignSpaceVisualizerRegistered(StateTransitionBasedIDesignSpaceVisualizer visualizer) {
        if (visualizers != null) {
            return visualizers.contains(visualizer);
        }
        return false;
    }

    public void initVisualizersForThread(StateTransitionBasedThreadContext threadContext) {
        if (visualizers != null && !visualizers.isEmpty()) {
            for (StateTransitionBasedIDesignSpaceVisualizer visualizer : visualizers) {
                visualizer.init(threadContext);
                threadContext.getDesignSpaceManager().registerExploreEventHandler(visualizer);
            }
        }
    }

    public boolean isExceptionHappendInOtherThread() {
        return !exceptions.isEmpty();
    }

    public Collection<Throwable> getExceptions() {
        return exceptions;
    }

    public IStateCoderFactory getStateCoderFactory() {
        return stateCoderFactory;
    }

    public void setStateCoderFactory(IStateCoderFactory stateCoderFactory) {
        this.stateCoderFactory = stateCoderFactory;
    }

    public Set<BatchTransformationRule<?, ?>> getTransformations() {
        return transformations;
    }

    public void setTransformations(Set<BatchTransformationRule<?, ?>> transformations) {
        this.transformations = transformations;
    }

    public StateTransitionBasedDSEThreadPool getThreadPool() {
        return threadPool;
    }

    public IDesignSpace getDesignSpace() {
        return designSpace;
    }

    public void setDesignSpace(IDesignSpace designSpace) {
        this.designSpace = designSpace;
    }

    public int getNumberOfStartedThreads() {
        return numberOfStartedThreads;
    }

    public Object getSharedObject() {
        return sharedObject;
    }

    public void setSharedObject(Object sharedObject) {
        this.sharedObject = sharedObject;
    }

    public ExplorationProcessState getState() {
        return state;
    }

    public List<StateTransitionBasedIObjective> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<StateTransitionBasedIObjective> objectives) {
        this.objectives = objectives;
    }

    public List<StateTransitionBasedIGlobalConstraint> getGlobalConstraints() {
        return globalConstraints;
    }

    public void setGlobalConstraints(List<StateTransitionBasedIGlobalConstraint> globalConstraints) {
        this.globalConstraints = globalConstraints;
    }

    AtomicBoolean getFirstThreadContextInited() {
        return firstThreadContextInited;
    }

    AtomicBoolean getFirstThreadContextIniting() {
        return firstThreadContextIniting;
    }

    public StateTransitionBasedIObjective[][] getLeveledObjectives() {
        return leveledObjectives;
    }

    public void setSolutionStore(StateTransitionBasedSolutionStore solutionStore) {
        this.solutionStore = solutionStore;
    }

    public StateTransitionBasedSolutionStore getSolutionStore() {
        return solutionStore;
    }

    public Map<RuleSpecification<?>, BatchTransformationRule<?, ?>> getSpecificationRuleMap() {
        return specificationRuleMap;
    }

    public void setConflictResolver(ConflictResolver conflictResolver) {
        this.conflictResolver = conflictResolver;
    }

    public ConflictResolver getConflictResolver() {
        return conflictResolver;
    }
}
