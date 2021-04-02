package event.driven.scenario.dse.source;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;

public class StateTransitionBasedDSEThreadPool extends ThreadPoolExecutor {
	private static final long THREAD_KEEP_ALIVE_IN_SECONDS = 60;

    public StateTransitionBasedDSEThreadPool() {
        // Based on the Executors.newCachedThreadPool()
        super(0, getProcNumber(), THREAD_KEEP_ALIVE_IN_SECONDS, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    }

    // helper for constructor
    private static int getProcNumber() {
        return Runtime.getRuntime().availableProcessors();
    }

    public boolean tryStartNewStrategy(StateTransitionBasedExplorerThread strategy) {

        if (!canStartNewThread()) {
            return false;
        }

        try {
            submit(strategy);
        } catch (RejectedExecutionException e) {
            Logger.getLogger(DesignSpaceExplorer.class).info("Couldn't start new thread.", e);
            return false;
        }

        return true;
    }

    public boolean canStartNewThread() {
        return getMaximumPoolSize() > getActiveCount();
    }
}
