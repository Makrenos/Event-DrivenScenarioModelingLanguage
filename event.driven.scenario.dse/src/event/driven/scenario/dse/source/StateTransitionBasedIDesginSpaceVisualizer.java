package event.driven.scenario.dse.source;

import org.eclipse.viatra.dse.visualizer.DesignSpaceVisualizerOptions;
import org.eclipse.viatra.dse.visualizer.IExploreEventHandler;

public interface StateTransitionBasedIDesginSpaceVisualizer extends IExploreEventHandler {
    /**
     * Initializes the instance with a starting thread's context. Can be called multiple times and concurrently.
     * 
     * @see DesignSpaceVisualizerOptions
     * @param context
     */
    void init(StateTransitionBasedThreadContext context);

    /**
     * Saves the captured data.
     */
    void save();

}
