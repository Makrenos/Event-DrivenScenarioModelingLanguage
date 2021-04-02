package event.driven.scenario.dse.source;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.solutionstore.ISolutionNameProvider;
import org.eclipse.viatra.dse.solutionstore.LogSolutionHandler;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class StateTransitionBasedSolutionStore {
	public interface ISolutionSaver {
        void setSolutionsCollection(Map<Object, Solution> solutions);
        boolean saveSolution(StateTransitionBasedThreadContext context, Object id, SolutionTrajectory solutionTrajectory);
    }

    public interface IEnoughSolutions extends StateTransitionBasedISolutionFoundHandler {
        boolean enoughSolutions();
    }

    public static class ANumberOfEnoughSolutions implements IEnoughSolutions {

        private final AtomicInteger foundSolutions;
        private final AtomicBoolean foundEnoughSolutions;

        public ANumberOfEnoughSolutions(int number) {
            foundSolutions = new AtomicInteger(number);
            foundEnoughSolutions = new AtomicBoolean(false);
        }

        @Override
        public boolean enoughSolutions() {
            return foundEnoughSolutions.get();
        }

        @Override
        public void solutionFound(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
            int solutionsToFind = foundSolutions.decrementAndGet();
            if (solutionsToFind == 0) {
                foundEnoughSolutions.set(true);
            }
        }

        @Override
        public void solutionTriedToSave(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
        }
    }

    public static class SimpleSolutionSaver implements ISolutionSaver {

        private Map<Object, Solution> solutions;

        @Override
        public void setSolutionsCollection(Map<Object, Solution> solutions) {
            this.solutions = solutions;
        }

        @Override
        public boolean saveSolution(StateTransitionBasedThreadContext context, Object id, SolutionTrajectory solutionTrajectory) {
            Solution solution = solutions.get(id);
            if (solution != null) {
                if (solution.getTrajectories().contains(solutionTrajectory)) {
                    return false;
                } else {
                    solution.addTrajectory(solutionTrajectory);
                    solutionTrajectory.setSolution(solution);
                }
            } else {
                solution = new Solution(id, solutionTrajectory);
                solutions.put(id, solution);
                solutionTrajectory.setSolution(solution);
            }
            return true;
        }
    }

    public static class BestSolutionSaver implements ISolutionSaver {

        private Map<Object, Solution> solutions;
        private Map<SolutionTrajectory, Fitness> trajectories = new HashMap<>();

        @Override
        public void setSolutionsCollection(Map<Object, Solution> solutions) {
            this.solutions = solutions;
        }

        @Override
        public boolean saveSolution(StateTransitionBasedThreadContext context, Object id, SolutionTrajectory solutionTrajectory) {

            Fitness lastFitness = context.getLastFitness();
            StateTransitionBasedObjectiveComparatorHelper comparatorHelper = context.getObjectiveComparatorHelper();

            List<SolutionTrajectory> dominatedTrajectories = new ArrayList<>();

            for (Entry<SolutionTrajectory, Fitness> entry : trajectories.entrySet()) {
                int isLastFitnessBetter = comparatorHelper.compare(lastFitness, entry.getValue());
                if (isLastFitnessBetter < 0) {
                    return false;
                }
                if (isLastFitnessBetter > 0) {
                    dominatedTrajectories.add(entry.getKey());
                }
            }

            boolean solutionSaved = false;

            Solution solution = solutions.get(id);
            if (solution != null) {
                if (!solution.getTrajectories().contains(solutionTrajectory)) {
                    solution.addTrajectory(solutionTrajectory);
                    solutionTrajectory.setSolution(solution);
                    solutionSaved = true;
                    trajectories.put(solutionTrajectory, lastFitness);
                }
            } else {
                solution = new Solution(id, solutionTrajectory);
                solutions.put(id, solution);
                solutionTrajectory.setSolution(solution);
                solutionSaved = true;
                trajectories.put(solutionTrajectory, lastFitness);
            }

            for (SolutionTrajectory st : dominatedTrajectories) {
                trajectories.remove(st);
                Solution s = st.getSolution();
                if (!s.getTrajectories().remove(st)) {
                    throw new DSEException("Should not happen.");
                }
                if (s.getTrajectories().isEmpty()) {
                    Object stateCode = s.getStateCode();
                    solutions.remove(stateCode);
                }
            }

            return solutionSaved;
        }

    }

    protected boolean acceptOnlyGoalSolutions = true;
    protected final Map<Object, Solution> solutions = new HashMap<Object, Solution>();
    protected ISolutionSaver solutionSaver = new SimpleSolutionSaver();
    protected List<StateTransitionBasedISolutionFoundHandler> solutionFoundHandlers = new ArrayList<StateTransitionBasedISolutionFoundHandler>(1);

    protected final IEnoughSolutions enoughSolutions;

    public StateTransitionBasedSolutionStore() {
        this(new IEnoughSolutions() {
            @Override
            public void solutionFound(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
            }

            @Override
            public boolean enoughSolutions() {
                return false;
            }

            @Override
            public void solutionTriedToSave(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
            }
        });
    }

    public StateTransitionBasedSolutionStore(int numOfSolutionsToFind) {
        this(new ANumberOfEnoughSolutions(numOfSolutionsToFind));
    }

    public StateTransitionBasedSolutionStore(IEnoughSolutions enoughSolutionsImpl) {
        enoughSolutions = enoughSolutionsImpl;
    }

    public synchronized void newSolution(StateTransitionBasedThreadContext context) {
        solutionSaver.setSolutionsCollection(solutions);
        Fitness fitness = context.getLastFitness();
        StateTransitionBasedDesignSpaceManager dsm = context.getDesignSpaceManager();
        Object id = dsm.getCurrentState();
        IStateCoderFactory stateCoderFactory = context.getGlobalContext().getStateCoderFactory();
        SolutionTrajectory solutionTrajectory = dsm.getTrajectoryInfo().createSolutionTrajectory(stateCoderFactory);
        solutionTrajectory.setFitness(fitness);

        if (acceptOnlyGoalSolutions && !fitness.isSatisifiesHardObjectives()) {
            unsavedSolutionCallbacks(context, solutionTrajectory);
            return;
        }

        boolean solutionSaved = solutionSaver.saveSolution(context, id, solutionTrajectory);

        if (solutionSaved) {
            enoughSolutions.solutionFound(context, solutionTrajectory);

            savedSolutionCallbacks(context, solutionTrajectory);

            if (enoughSolutions.enoughSolutions()) {
                context.getGlobalContext().stopAllThreads();
            }
        } else {
            unsavedSolutionCallbacks(context, solutionTrajectory);
        }
    }

    private void unsavedSolutionCallbacks(StateTransitionBasedThreadContext context, SolutionTrajectory solutionTrajectory) {
        for (StateTransitionBasedISolutionFoundHandler handler : solutionFoundHandlers) {
            handler.solutionTriedToSave(context, solutionTrajectory);
        }
    }

    private void savedSolutionCallbacks(StateTransitionBasedThreadContext context, SolutionTrajectory solutionTrajectory) {
        for (StateTransitionBasedISolutionFoundHandler handler : solutionFoundHandlers) {
            handler.solutionFound(context, solutionTrajectory);
        }
    }

    public synchronized Collection<Solution> getSolutions() {
        return solutions.values();
    }

    public synchronized void registerSolutionFoundHandler(StateTransitionBasedISolutionFoundHandler handler) {
        if (solutionFoundHandlers == null) {
            solutionFoundHandlers = new ArrayList<StateTransitionBasedISolutionFoundHandler>(1);
        }
        solutionFoundHandlers.add(handler);
    }

    public StateTransitionBasedSolutionStore logSolutionsWhenFound() {
        registerSolutionFoundHandler(new StateTransitionBasedLogSolutionHandler());
        Logger.getLogger(LogSolutionHandler.class).setLevel(Level.INFO);
        return this;
    }

    public StateTransitionBasedSolutionStore saveModelWhenFound() {
        registerSolutionFoundHandler(new StateTransitionBasedModelSaverSolutionFoundHandler());
        return this;
    }

    public StateTransitionBasedSolutionStore saveModelWhenFound(String extension) {
        registerSolutionFoundHandler(new StateTransitionBasedModelSaverSolutionFoundHandler(extension));
        return this;
    }

    public StateTransitionBasedSolutionStore saveModelWhenFound(String prefix, String extension) {
        registerSolutionFoundHandler(new StateTransitionBasedModelSaverSolutionFoundHandler(prefix, extension));
        return this;
    }

    public StateTransitionBasedSolutionStore saveModelWhenFound(ISolutionNameProvider solutionNameProvider) {
        registerSolutionFoundHandler(new StateTransitionBasedModelSaverSolutionFoundHandler(solutionNameProvider));
        return this;
    }

    public StateTransitionBasedSolutionStore acceptGoalSolutionsOnly() {
        acceptOnlyGoalSolutions = true;
        return this;
    }

    public StateTransitionBasedSolutionStore acceptAnySolutions() {
        acceptOnlyGoalSolutions = false;
        return this;
    }

    public StateTransitionBasedSolutionStore withSolutionSaver(ISolutionSaver solutionSaver) {
        this.solutionSaver = solutionSaver;
        return this;
    }

    public StateTransitionBasedSolutionStore storeBestSolutionsOnly() {
        this.solutionSaver = new BestSolutionSaver();
        return this;
    }

    public void saveModels(Notifier model, ISolutionNameProvider solutionNameProvider) {
        try {
            for (Solution solution : solutions.values()) {
                SolutionTrajectory trajectory = solution.getArbitraryTrajectory();
                trajectory.doTransformationUndoable(model);
                EMFHelper.saveModel(model, "./solutions/"+solutionNameProvider.getName());
                trajectory.undoTransformation();
            }
        } catch (ViatraQueryException e) {
            Logger.getLogger(SolutionStore.class).error("Exception happened during model saving.", e);
        }
    }
}
