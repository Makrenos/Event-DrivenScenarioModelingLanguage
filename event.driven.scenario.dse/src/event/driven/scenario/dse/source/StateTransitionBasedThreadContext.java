package event.driven.scenario.dse.source;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ActivationCodesConflictSet;
import org.eclipse.viatra.dse.base.DseConflictResolver;
import org.eclipse.viatra.dse.base.DseConflictSet;
import org.eclipse.viatra.dse.base.DseIdPoolHelper;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;
import org.eclipse.viatra.transformation.evm.api.RuleSpecification;
import org.eclipse.viatra.transformation.evm.api.event.EventFilter;
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictSet;
import org.eclipse.viatra.transformation.evm.specific.RuleEngines;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

import edsdl.Action;
import edsdl.StateMachine;
import edsdl.Transition;
import scenedl.Scene;

public class StateTransitionBasedThreadContext implements StateTransitionBasedIDseStrategyContext{
    
    private final StateTransitionBasedGlobalContext globalContext;
    private final StateTransitionBasedIStrategy strategy;
    private StateTransitionBasedExplorerThread explorerThread;
    private RuleEngine ruleEngine;
    private ViatraQueryEngine queryEngine;
    private EditingDomain domain;
    private Notifier model;
    private StateTransitionBasedDesignSpaceManager designSpaceManager;
    private List<StateTransitionBasedIObjective> objectives;
    private List<StateTransitionBasedIGlobalConstraint> globalConstraints;
    private Fitness lastFitness;
    private StateTransitionBasedObjectiveComparatorHelper objectiveComparatorHelper;
    private IStateCoder stateCoder;
    private DseConflictResolver dseConflictResolver;
    private DseConflictSet dseConflictSet;
    private ActivationCodesConflictSet activationCodesConflictSet;

    /**
     * This value is true after the {@link ThreadContext} has been initialized in it's own thread.
     */
    private AtomicBoolean inited = new AtomicBoolean(false);

    private boolean isFirstThread = false;
    private StateTransitionBasedIObjective[][] leveledObjectives;
    
    private static class GetRuleExecutionsImpl implements DseIdPoolHelper.IGetRuleExecutions {

        private List<BatchTransformationRule<?, ?>> executedRules;

        public GetRuleExecutionsImpl(List<BatchTransformationRule<?, ?>> executedRulesView) {
            this.executedRules = executedRulesView;
        }
        
        @Override
        public int getRuleExecutions(BatchTransformationRule<?, ?> rule) {
            int nextId = 0;
            for (BatchTransformationRule<?, ?> r : executedRules) {
                if (r.equals(rule)) {
                    nextId ++;
                }
            }
            return nextId;
        }
        
    }
    
    public DseConflictResolver getConflictResolver() {
        return dseConflictResolver;
    }

    public ConflictSet getConflictSet() {
        return dseConflictSet;
    }

    /**
     * Creates a {@link ThreadContext} and sets it up to be initialized on the given {@link TransactionalEditingDomain}
     * 
     * @param globalContext
     * @param strategyBase
     * @param domain
     * @param trajectoryInfoToClone
     * @param parentGuidance
     */
    public StateTransitionBasedThreadContext(final StateTransitionBasedGlobalContext globalContext, StateTransitionBasedIStrategy strategy, Notifier model) {
        Preconditions.checkArgument(model != null, "Cannot initialize ThreadContext on a null model.");
        this.globalContext = globalContext;
        this.strategy = strategy;
        this.model = model;
    }

    /**
     * Initializes the {@link ThreadContext} by initializing the underlying {@link ViatraQueryEngine} and
     * {@link RuleEngine}. {@link Guidance} initialization is also happening within this method.
     * 
     * @throws DSEException
     */
    public void init() {

        AtomicBoolean isFirst = globalContext.getFirstThreadContextIniting();
        AtomicBoolean isFirstReady = globalContext.getFirstThreadContextInited();
        if (!isFirstReady.get()) {
            if (!isFirst.compareAndSet(false, true)) {
                try {
                    do {
                        Thread.sleep(5);
                    } while (!isFirstReady.get());
                } catch (InterruptedException e) {
                }
            } else {
                isFirstThread = true;
            }
        }
        // prohibit re-initialization
        Preconditions.checkArgument(!inited.getAndSet(true), "This Thread context has been initialized already!");

        try {
            // initialize query engine
            final EMFScope scope = new EMFScope(model);
            queryEngine = ViatraQueryEngine.on(scope);
            

            stateCoder = getGlobalContext().getStateCoderFactory().createStateCoder();
            stateCoder.init(model);
            stateCoder.createStateCode();

            ConflictResolver activationOrderingCconflictResolver = globalContext.getConflictResolver();
            dseConflictResolver = new DseConflictResolver(activationOrderingCconflictResolver, stateCoder);
            
            ruleEngine = RuleEngines.createViatraQueryRuleEngine(queryEngine);
            ruleEngine.setConflictResolver(dseConflictResolver);
            for (BatchTransformationRule<?, ?> tr : globalContext.getTransformations()) {
                ruleEngine.addRule(tr.getRuleSpecification(), (EventFilter<IPatternMatch>) tr.getFilter());
            }
            dseConflictSet = dseConflictResolver.getLastCreatedConflictSet();
            activationCodesConflictSet = dseConflictSet.getActivationCodesConflictSet();
            activationCodesConflictSet.updateActivationCodes();


        } catch (ViatraQueryException e) {
            throw new DSEException("Failed to create unmanaged ViatraQueryEngine on the model.", e);
        }

        if (isFirstThread) {

            objectives = globalContext.getObjectives();
            leveledObjectives = globalContext.getLeveledObjectives();
            globalConstraints = globalContext.getGlobalConstraints();

        } else {
            objectives = new ArrayList<StateTransitionBasedIObjective>();

            StateTransitionBasedIObjective[][] leveledObjectivesToCopy = globalContext.getLeveledObjectives();
            leveledObjectives = new StateTransitionBasedIObjective[leveledObjectivesToCopy.length][];
            for (int i = 0; i < leveledObjectivesToCopy.length; i++) {
                leveledObjectives[i] = new StateTransitionBasedIObjective[leveledObjectivesToCopy[i].length];
                for (int j = 0; j < leveledObjectivesToCopy[i].length; j++) {
                    leveledObjectives[i][j] = leveledObjectivesToCopy[i][j].createNew();
                    objectives.add(leveledObjectives[i][j]);
                }
            }

            globalConstraints = new ArrayList<StateTransitionBasedIGlobalConstraint>();
            for (StateTransitionBasedIGlobalConstraint globalConstraint : globalContext.getGlobalConstraints()) {
                globalConstraints.add(globalConstraint.createNew());
            }

        }
        // create the thread specific DesignSpaceManager
        this.domain = EMFHelper.createEditingDomain(model);
        designSpaceManager = new StateTransitionBasedDesignSpaceManager(this);

        boolean isThereHardObjective = false;
        for (StateTransitionBasedIObjective objective : objectives) {
            objective.init(this);
            if (objective.isHardObjective()) {
                isThereHardObjective = true;
            }
        }
        if (!isThereHardObjective) {
            Logger.getLogger(IStrategy.class).warn(
                    "No hard objective is specified: all reachable state is a solution. Use a dummy hard objective to be explicit.");
        }
        
        for (StateTransitionBasedIGlobalConstraint globalConstraint : globalConstraints) {
            globalConstraint.init(this);
        }

        DseIdPoolHelper.INSTANCE.registerRules(new GetRuleExecutionsImpl(getDesignSpaceManager().getTrajectoryInfo().getRules()), getRules());

        globalContext.initVisualizersForThread(this);

        if (isFirstThread) {
            isFirstReady.set(true);
        }

    }

    public Fitness calculateFitness() {
        Fitness result = new Fitness();

        boolean satisifiesHardObjectives = true;

        for (StateTransitionBasedIObjective objective : objectives) {
            Double fitness = objective.getFitness(this);
            result.put(objective.getName(), fitness);
            if (objective.isHardObjective() && !objective.satisifiesHardObjective(fitness)) {
                satisifiesHardObjectives = false;
            }
        }

        result.setSatisifiesHardObjectives(satisifiesHardObjectives);

        lastFitness = result;

        return result;
    }

    public boolean checkGlobalConstraints() {
        for (StateTransitionBasedIGlobalConstraint globalConstraint : globalContext.getGlobalConstraints()) {
            if (!globalConstraint.checkGlobalConstraint(this)) {
                return false;
            }
        }
        return true;
    }

    public RuleEngine getRuleEngine() {
        return ruleEngine;
    }

    public StateTransitionBasedGlobalContext getGlobalContext() {
        return globalContext;
    }

    public StateTransitionBasedDesignSpaceManager getDesignSpaceManager() {
        return designSpaceManager;
    }

    public EditingDomain getEditingDomain() {
        return domain;
    }

    public Notifier getModel() {
        return model;
    }

    public ViatraQueryEngine getQueryEngine() {
        return queryEngine;
    }

    public StateTransitionBasedIStrategy getStrategy() {
        return strategy;
    }

    public StateTransitionBasedExplorerThread getExplorerThread() {
        return explorerThread;
    }

    public void setExplorerThread(StateTransitionBasedExplorerThread explorerThread) {
        this.explorerThread = explorerThread;
    }

    public Fitness getLastFitness() {
        return lastFitness;
    }

    public StateTransitionBasedObjectiveComparatorHelper getObjectiveComparatorHelper() {
        if (objectiveComparatorHelper == null) {
            objectiveComparatorHelper = new StateTransitionBasedObjectiveComparatorHelper(leveledObjectives);
        }
        return objectiveComparatorHelper;
    }

    public StateTransitionBasedIObjective[][] getLeveledObjectives() {
        return leveledObjectives;
    }
    
    public List<StateTransitionBasedIObjective> getObjectives() {
        return objectives;
    }
    
    public List<StateTransitionBasedIGlobalConstraint> getGlobalConstraints() {
        return globalConstraints;
    }

    @Override
    public StateTransitionBasedSolutionStore getSolutionStore() {
        return globalContext.getSolutionStore();
    }

    @Override
    public void newSolution() {
        globalContext.getSolutionStore().newSolution(this);
    }

    @Override
    public Object getSharedObject() {
        return globalContext.getSharedObject();
    }

    @Override
    public void setSharedObject(Object sharedObject) {
        globalContext.setSharedObject(sharedObject);
    }

    @Override
    public Set<BatchTransformationRule<?, ?>> getRules() {
        return globalContext.getTransformations();
    }

    @Override
    public BatchTransformationRule<?, ?> getRuleByRuleSpecification(RuleSpecification<?> ruleSpecification) {
        return globalContext.getSpecificationRuleMap().get(ruleSpecification);
    }

    @Override
    public StateTransitionBasedExplorerThread tryStartNewThread(StateTransitionBasedIStrategy strategy) {
        return globalContext.tryStartNewThread(this, strategy);
    }

    @Override
    public StateTransitionBasedExplorerThread tryStartNewThreadWithoutModelClone(StateTransitionBasedIStrategy strategy) {
        return globalContext.tryStartNewThreadWithoutModelClone(this, strategy);
    }

    @Override
    public void startAllThreads(StateTransitionBasedIStrategyFactory strategyFactory) {
        globalContext.startAllThreads(this, strategyFactory);
    }

    @Override
    public IStateCoder getStateCoder() {
        return stateCoder;
    }

    @Override
    public IDesignSpace getDesignSpace() {
        return globalContext.getDesignSpace();
    }

    @Override
    public TrajectoryInfo getTrajectoryInfo() {
        return designSpaceManager.getTrajectoryInfo();
    }

    @Override
    public List<Object> getTrajectory() {
        return designSpaceManager.getTrajectoryInfo().getTrajectory();
    }

    @Override
    public List<Object> getTrajectoryCopied() {
        return new ArrayList<Object>(getTrajectory());
    }

    @Override
    public int getDepth() {
        return designSpaceManager.getTrajectoryInfo().getDepth();
    }

    @Override
    public Object getCurrentStateId() {
        return designSpaceManager.getTrajectoryInfo().getCurrentStateId();
    }

    @Override
    public Object getTransitionByActivation(Activation<?> activation) {
        return designSpaceManager.getTransitionByActivation(activation);
    }

    @Override
    public Activation<?> getActivationById(Object activationId) {
        return designSpaceManager.getActivationById(activationId);
    }

    @Override
    public BatchTransformationRule<?, ?> getRuleByActivation(Activation<?> activation) {
        return designSpaceManager.getRuleByActivation(activation);
    }

    @Override
    public BatchTransformationRule<?, ?> getRuleByActivationId(Object activationId) {
        return designSpaceManager.getRuleByActivationId(activationId);
    }

    @Override
    public Collection<Object> getCurrentActivationIds() {
        return designSpaceManager.getTransitionsFromCurrentState();
    }

    @Override
    public void executeAcitvationId(Object activationId) {
        designSpaceManager.fireActivation(activationId);
    }

    @Override
    public boolean tryExecuteAcitvationId(Object activationId) {
        return designSpaceManager.tryFireActivation(activationId);
    }

    @Override
    public boolean executeRandomActivationId() {
        return designSpaceManager.executeRandomActivationId();
    }

    @Override
    public void executeTrajectory(Object[] activationIds) {
        designSpaceManager.executeTrajectory(activationIds);
    }

    @Override
    public void executeTrajectory(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex) {
        designSpaceManager.executeTrajectory(activationIds, fromIncludedIndex, toExcludedIndex);
    }

    @Override
    public int executeTrajectoryByTrying(Object[] activationIds) {
        return designSpaceManager.executeTrajectoryByTrying(activationIds);
    }

    @Override
    public int executeTrajectoryByTrying(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex) {
        return designSpaceManager.executeTrajectoryByTrying(activationIds, fromIncludedIndex, toExcludedIndex);
    }

    @Override
    public int executeTrajectoryWithoutStateCoding(Object[] activationIds) {
        return designSpaceManager.executeTrajectoryWithoutStateCoding(activationIds);
    }

    @Override
    public int executeTrajectoryWithoutStateCoding(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex) {
        return designSpaceManager.executeTrajectoryWithoutStateCoding(activationIds, fromIncludedIndex, toExcludedIndex);
    }

    @Override
    public int executeTrajectoryByTryingWithoutStateCoding(Object[] activationIds) {
        return designSpaceManager.executeTrajectoryByTryingWithoutStateCoding(activationIds);
    }

    @Override
    public int executeTrajectoryByTryingWithoutStateCoding(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex) {
        return designSpaceManager.executeTrajectoryByTryingWithoutStateCoding(activationIds, fromIncludedIndex, toExcludedIndex);
    }

    @Override
    public void executeTrajectoryWithMinimalBacktrack(Object[] trajectory) {
        designSpaceManager.executeTrajectoryWithMinimalBacktrack(trajectory);
    }

    @Override
    public void executeTrajectoryWithMinimalBacktrack(Object[] trajectory, int toExcludedIndex) {
        designSpaceManager.executeTrajectoryWithMinimalBacktrack(trajectory, toExcludedIndex);
    }

    @Override
    public void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory) {
        designSpaceManager.executeTrajectoryWithMinimalBacktrackWithoutStateCoding(trajectory);
    }

    @Override
    public void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory, int toExcludedIndex) {
        designSpaceManager.executeTrajectoryWithMinimalBacktrackWithoutStateCoding(trajectory, toExcludedIndex);
    }
    
    @Override
    public boolean backtrack() {
        return designSpaceManager.undoLastTransformation();
    }

    @Override
    public void backtrackUntilLastCommonActivation(Object[] trajectory) {
        designSpaceManager.backtrackUntilLastCommonActivation(trajectory);
    }

    @Override
    public void backtrackUntilRoot() {
        designSpaceManager.undoUntilRoot();
    }

    @Override
    public boolean isCurrentStateAlreadyTraversed() {
        return designSpaceManager.isNewModelStateAlreadyTraversed();
    }

    @Override
    public boolean isCurrentStateInTrajectory() {
        return designSpaceManager.isCurentStateInTrajectory();
    }

    public ActivationCodesConflictSet getActivationCodesConflictSet() {
        return activationCodesConflictSet;
    }
    
    public void changeActivationOrdering(ChangeableConflictSet activationOrderingConflictSet) {
        this.dseConflictSet.changeActivationOrderingConflictSet(activationOrderingConflictSet);
    }

    public void changeActivationOrderingBack() {
        this.dseConflictSet.changeActivationOrderingConflictSetBack();
    }

    @Override
    public Collection<Object> getUntraversedActivationIds() {
    	Collection<Object> notFilteredActivationIds;
    	Collection<Object> activationIds = new ArrayList<Object>();
    	notFilteredActivationIds = designSpaceManager.getUntraversedTransitionsFromCurrentState();
    	//It would be more elegant, to extend the Notifier interface with a getStateMachine function, and the model has to implement the extended Notifier. (getModel().getStateMachine())
    	Scene s = (Scene)getModel();
    	boolean found = false;
    	
        for(Object o : notFilteredActivationIds) {
        	found = false;
        	for(Transition t : s.getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions()) {	
        		for(Action a : t.getRuleBasedActions()) {
                	if (o.toString().contains(a.getName())) {
                		found = true;
                	}
        		}
        	}
        	if(found) {
        		activationIds.add(o);
        	}
        }
        
        return activationIds;
    }
    
    public Collection<Object> getUntraversedActivationIds(StateMachine s) {
    	Collection<Object> notFilteredActivationIds;
    	Collection<Object> activationIds = new ArrayList<Object>();
    	notFilteredActivationIds = designSpaceManager.getUntraversedTransitionsFromCurrentState();
    	
    	boolean found = false;
    	
        for(Object o : notFilteredActivationIds) {
        	found = false;
        	for(Transition t : s.getRuntimestate().get(0).getActualState().getOutTransitions()) {	
        		for(Action a : t.getRuleBasedActions()) {
                	if (o.toString().contains(a.getName())) {
                		found = true;
                	}
        		}
        	}
        	if(found) {
        		activationIds.add(o);
        	}
        }
        
        return activationIds;
    }
    
    //default function, to include the activations defined in the filter
    public Collection<Object> getUntraversedActivationIds(List<String> filters){
    	return getUntraversedActivationIds(filters,true);
    }
    
    public Collection<Object> getUntraversedActivationIds(List<String> filters, boolean includeOrExclude) {
    	Collection<Object> notFilteredActivationIds;
    	Collection<Object> activationIds = new ArrayList<Object>();
    	notFilteredActivationIds = getDesignSpaceManager().getUntraversedTransitionsFromCurrentState();
    	Scene s = (Scene)getModel();
    	boolean found = false;
    	
        for(Object o : notFilteredActivationIds) {
        	found = false;
        	for(Transition t : s.getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions()) {
        		
        		for(Action a : t.getRuleBasedActions()) {
        			if(includeOrExclude) {
	                	if (o.toString().contains(a.getName()) && filters.toString().contains(o.toString())) {
	                		found = true;
	                	}
        			}else {
	                	if (o.toString().contains(a.getName()) && !filters.toString().contains(o.toString())) {
	                		found = true;
	                	}
        			}
        		}
        	}
        	if(found) {
        		activationIds.add(o);
        	}
        }
        
        return activationIds;
    }
}
