package event.driven.scenario.dse.source;

import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.solutionstore.SolutionStore.ISolutionSaver;

public interface StateTransitionBasedISolutionFoundHandler {

    /**
     * Called when a solution is saved by the {@link ISolutionSaver}. Later, this solution can be omitted from the final
     * set of solutions.
     * 
     * @param context
     * @param trajectory
     */
    void solutionFound(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory);

    /**
     * Called when the exploration found a solution but it was not saved because of certain conditions.
     * 
     * @param context
     * @param trajectory
     */
    void solutionTriedToSave(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory);
}
