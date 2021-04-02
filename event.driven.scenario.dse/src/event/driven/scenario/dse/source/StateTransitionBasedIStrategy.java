package event.driven.scenario.dse.source;

import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

public interface StateTransitionBasedIStrategy {
	 void initStrategy(StateTransitionBasedThreadContext context);

	    /**
	     * This method explores the design space as the implementation specifies. It will be called only once, hence the
	     * exploration loop is run by the implementation. The termination condition is also specified by the implementation
	     * and when it returns the exploration thread will be disposed.
	     */
	    void explore();

	    /**
	     * The implementation of this interface should be ready to be interrupted. If this method is called, the
	     * {@link IStrategy#explore()} method should return ASAP.
	     * 
	     * This method is also called by the {@link SolutionStore} class if enough solutions are found. 
	     */
	    void interruptStrategy();
}
