package event.driven.scenario.dse.source;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.solutionstore.ISolutionNameProvider;
import org.eclipse.viatra.dse.solutionstore.IdBasedSolutionNameProvider;
import org.eclipse.viatra.dse.util.EMFHelper;

public class StateTransitionBasedModelSaverSolutionFoundHandler implements StateTransitionBasedISolutionFoundHandler {
	private HashSet<Object> savedSolutions = new HashSet<Object>();
    private ISolutionNameProvider solutionNameProvider;

    public StateTransitionBasedModelSaverSolutionFoundHandler() {
        solutionNameProvider = new IdBasedSolutionNameProvider("solution", "xmi");
    }

    public StateTransitionBasedModelSaverSolutionFoundHandler(String extension) {
        solutionNameProvider = new IdBasedSolutionNameProvider("solution", extension);
    }

    public StateTransitionBasedModelSaverSolutionFoundHandler(String prefix, String extension) {
        solutionNameProvider = new IdBasedSolutionNameProvider(prefix, extension);
    }

    public StateTransitionBasedModelSaverSolutionFoundHandler(ISolutionNameProvider solutionNameProvider) {
        this.solutionNameProvider = solutionNameProvider;
    }

    @Override
    public void solutionTriedToSave(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
    }

    @Override
    public void solutionFound(StateTransitionBasedThreadContext context, SolutionTrajectory trajectory) {
        Object stateCode = trajectory.getSolution().getStateCode();

        if (savedSolutions.contains(stateCode)) {
            return;
        }

        savedSolutions.add(stateCode);
        Notifier clonedModel = EMFHelper.clone(context.getModel());
        EMFHelper.saveModel(clonedModel, "./solutions/"+solutionNameProvider.getName());
    }
}
