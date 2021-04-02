package event.driven.scenario.dse.source;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.solutionstore.LogSolutionHandler;

public class StateTransitionBasedLogSolutionHandler implements StateTransitionBasedISolutionFoundHandler {
	Logger logger = Logger.getLogger(LogSolutionHandler.class);

    @Override
    public void solutionFound(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
        logger.info("Solution registered: " + trajectory.toPrettyString());
    }

    @Override
    public void solutionTriedToSave(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
        logger.debug("Not good enough solution: " + trajectory.toPrettyString());
    }
}
