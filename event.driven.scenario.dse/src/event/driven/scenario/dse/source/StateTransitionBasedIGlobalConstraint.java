package event.driven.scenario.dse.source;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IGlobalConstraint;

public interface StateTransitionBasedIGlobalConstraint {

    /**
     * Returns the name of the global constraint.
     * 
     * @return The name of the global constraint.
     */
    String getName();

    /**
     * Checks whether the current state satisfies the global constraint.
     * 
     * @param context
     *            The {@link ThreadContext} which contains the necessary information.
     * @return True if the state is valid and exploration can be continued from the actual state.
     */
    boolean checkGlobalConstraint(StateTransitionBasedThreadContext context);

    /**
     * Initializes the global constraint. It is called exactly once for every thread starts.
     * 
     * @param context
     *            The {@link ThreadContext}.
     */
    void init(StateTransitionBasedThreadContext context);

    /**
     * Returns an instance of the {@link IGlobalConstraint}. If it returns the same instance, all the methods has to be
     * thread save as they are called concurrently.
     * 
     * @return An instance of the global constraint.
     */
    StateTransitionBasedIGlobalConstraint createNew();
}
