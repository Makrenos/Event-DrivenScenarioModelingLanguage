package event.driven.scenario.dse.source;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.DseIdPoolHelper;
import org.eclipse.viatra.dse.base.GlobalContext;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;

public class StateTransitionBasedExplorerThread implements Runnable {
	private final StateTransitionBasedThreadContext threadContext;

    private StateTransitionBasedIStrategy strategy;

    public StateTransitionBasedExplorerThread(final StateTransitionBasedThreadContext context) {
        this.threadContext = context;
        strategy = threadContext.getStrategy();
    }

    /**
     * Signals the {@link IStrategy} instance that execution should be stopped. By contract, the strategy is to
     * stop execution at the next stage of execution where stopping and exiting is appropriate.
     */
    public void stopRunning() {
        strategy.interruptStrategy();
    }

    /**
     * Starts the design space exploration. Returns only when the {@link IStrategy#explore()} method returns.
     */
    public void run() {
        StateTransitionBasedGlobalContext globalContext = threadContext.getGlobalContext();
        try {
            
            threadContext.init();

            strategy.initStrategy(threadContext);

            strategy.explore();

            threadContext.backtrackUntilRoot();

        } catch (Throwable e) {
            Logger.getLogger(IStrategy.class).error("Thread stopped unexpectedly!", e);
            globalContext.registerException(e);
        } finally {
            globalContext.strategyFinished(this);
            dispose();
        }
    }

    /**
     * Disposes of this strategy. Recursively calls dispose on the underlying {@link RuleEngine} and
     * {@link ViatraQueryEngine}. Calling this is only required if the design space exploration was launched in thread, as
     * the underlying engines get collected on the stop of the running {@link Thread}.
     */
    public void dispose() {
        threadContext.getRuleEngine().dispose();
        DseIdPoolHelper.INSTANCE.disposeByThread();
    }

    /**
     * Returns the associated {@link ThreadContext} that houses all the thread specific data about the exploration
     * process, and is also the gateway to the {@link GlobalContext} which stores data relevant to the design space
     * exploration process as a whole.
     * 
     * @return the relevant {@link ThreadContext}.
     */
    public StateTransitionBasedThreadContext getThreadContext() {
        return threadContext;
    }
}
