package event.driven.scenario.dse.statecoder;



import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dl.edsdl.StateMachine;
import event.driven.scenario.dl.edsdl.Transition;
import event.driven.scenario.dse.queries.*;

public class SceneStateCoder implements IStateCoder {

    //private static final String CX = "CX";
    private StateMachine m;

    @Override
    public void init(Notifier notifier) {
        if (notifier instanceof StateMachine) {
            this.m = (StateMachine) notifier;
        } else if (notifier instanceof Resource) {
            this.m = (StateMachine) ((Resource)notifier).getContents().get(0);
        } else if (notifier instanceof ResourceSet) {
            this.m = (StateMachine) ((ResourceSet)notifier).getResources().get(0).getContents().get(0);
        }
    }

    @Override
    public Object createStateCode() {
        
        EList<State> states = m.getStates();
        String[] stateCodes = new String[m.getStates().size()];

        for (int i = 0; i < states.size(); i++) {
        	State state = states.get(i);
            StringBuilder sb = new StringBuilder();
//            sb.append(clazz.getName());
            EList<Transition> outTransitions = state.getOutTransitions();
            String[] names = new String[outTransitions.size()];
            int index = 0;
            for (Transition transition : outTransitions) {
            	
                names[index++] = transition.getPattern()+"(c: Car),Target State:"+transition.getTargetState().getName()+",";
            }
            index--;
            names[index] = names[index].substring(0,names[index].length() -1 );
            //Arrays.sort(names);
            sb.append(state.getName()+":");
            sb.append('(');
            for (String code : names) {
                sb.append(code);
            }
            sb.append("),");
            stateCodes[i] = sb.toString();
        }
        
        //Arrays.sort(elementCodes);
        
        StringBuilder sb = new StringBuilder();
        
        for (String stateCode : stateCodes) {
            sb.append(stateCode);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
    

    @Override
    public Object createActivationCode(IPatternMatch match) {
        
    				if (match instanceof GetCurrentState.Match) {
    					GetCurrentState.Match currentStateMatch = (GetCurrentState.Match) match;
    		        	return ("Current State:" + currentStateMatch.getActualState().getName() + ", Outgoing Transitions:"+currentStateMatch.getActualState().getOutTransitions()).intern();
    		        }
        else {
            throw new RuntimeException("Unsopprted rule.");
        }
    }

}
