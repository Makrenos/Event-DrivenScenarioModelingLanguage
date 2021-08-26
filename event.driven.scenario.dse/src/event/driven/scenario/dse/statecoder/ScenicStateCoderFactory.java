package event.driven.scenario.dse.statecoder;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;


public class ScenicStateCoderFactory implements IStateCoderFactory {

    @Override
    public IStateCoder createStateCoder() {
        return new SceneStateCoder();
    }
}
