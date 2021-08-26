package event.driven.scenario.dse.statecoder;

import java.util.StringJoiner;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import behavior.Behavior;
import behavior.BehaviorList;
import behavior.ListsOfBehaviors;

public class ScenicStateCoder implements IStateCoder {

    private ListsOfBehaviors l;

    @Override
    public void init(Notifier notifier) {
        if (notifier instanceof ListsOfBehaviors) {
            this.l = (ListsOfBehaviors) notifier;
        } else if (notifier instanceof Resource) {
            this.l = (ListsOfBehaviors) ((Resource)notifier).getContents().get(0);
        } else if (notifier instanceof ResourceSet) {
            this.l = (ListsOfBehaviors) ((ResourceSet)notifier).getResources().get(0).getContents().get(0);
        }
    }

    @Override
    public Object createStateCode() {
        
    	//State currState = s.getStateMachine().getRuntimestate().get(0).getActualState();
        EList<BehaviorList> behaviorLists = l.getBehaviorLists();
        String[] stateCodes = new String[behaviorLists.size()];
        int j = 0;
        for (int i = 0; i < behaviorLists.size(); i++) {
        	BehaviorList b = behaviorLists.get(i);
	        StringBuilder sb = new StringBuilder();
	        EList<Behavior> behaviors = b.getBehaviors();
	        String[] behaves = new String[behaviors.size()+1];
	        	for(Behavior be: behaviors) {
	        		int index = 0;
	        		behaves[index++] = be.getName() +", ";
	        	}

	            sb.append("for actor:" + b.getActor().getName());
	            stateCodes[j] = sb.toString();
	            j++;
			
        }
        StringBuilder sb = new StringBuilder();
        //sb.append(/*"Current state: " + currState.getName()+ */". Dynamic entities: ");
        for (String stateCode : stateCodes) {
            sb.append(stateCode);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
    

    @Override
    public Object createActivationCode(IPatternMatch match) {
    	StringJoiner sb = new StringJoiner(", ");

    	for(int i = 0 ; i < match.parameterNames().size(); i++) {
    		if(match.get(i).getClass().getSimpleName().equals("BehaviorListImpl")) {
    			BehaviorList bl = (BehaviorList) match.get(i);
    			sb.add(bl.getActor().getName() +" now has " +bl.getNumberOfBehaviors()+" behaviors");
    		}    		
    	}    	
    	return sb.toString();
    }

}
