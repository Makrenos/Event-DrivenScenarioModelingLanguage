package event.driven.scenario.dse.statecoder;

import java.util.StringJoiner;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import edsdl.RuntimeState;
import edsdl.State;
import scenedl.DynamicEntity;
import scenedl.Element;
import scenedl.RegularAttribute;
import scenedl.Scene;

public class SceneStateCoder implements IStateCoder {

    private Scene s;

    @Override
    public void init(Notifier notifier) {
        if (notifier instanceof Scene) {
            this.s = (Scene) notifier;
        } else if (notifier instanceof Resource) {
            this.s = (Scene) ((Resource)notifier).getContents().get(0);
        } else if (notifier instanceof ResourceSet) {
            this.s = (Scene) ((ResourceSet)notifier).getResources().get(0).getContents().get(0);
        }
    }

    @Override
    public Object createStateCode() {
        
    	//State currState = s.getStateMachine().getRuntimestate().get(0).getActualState();
        EList<Element> elements = s.getElements();
        int numOfDynElements=0;
        for (Element element : elements) {
			if(element.getType().equals("dynamic_entity")) {
				numOfDynElements++;
			}
		}
        String[] stateCodes = new String[numOfDynElements];
        int j = 0;
        for (int i = 0; i < elements.size(); i++) {
        	Element e = elements.get(i);
			if(e.getType().equals("dynamic_entity")) {
				DynamicEntity de = (DynamicEntity) e;
	            StringBuilder sb = new StringBuilder();
	            EList<RegularAttribute> attributes = de.getAttributes();
	            String[] attribs = new String[attributes.size()+1];
	            int index = 0;
	            for (RegularAttribute a : attributes) {
	            		attribs[index++] =  a.getName() + ": " + a.getValue() + "," ;
	            }
	            attribs[index++] = de.getName()+"Position: x: " + de.getPosition().getX() + " y: " + de.getPosition().getY() +" Speed: x: " + de.getSpeed().getX() + " y: " + de.getSpeed().getY() ;

	            sb.append(e.getName()+":");
	            sb.append('(');
	            for (String code : attribs) {
	                sb.append(code);
	            }
	            if(de.getOn() != null) {
	            	sb.append(") Using: "+de.getOn().getName()+",");
	            }else {
	            	sb.append("),");
	            }
	            stateCodes[j] = sb.toString();
	            j++;
			}
        }
        StringBuilder sb = new StringBuilder();
        sb.append(/*"Current state: " + currState.getName()+ */". Dynamic entities: ");
        for (String stateCode : stateCodes) {
            sb.append(stateCode);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
    

    @Override
    public Object createActivationCode(IPatternMatch match) {
    	//add action and current state
    	String s = "";
    	StringJoiner sb = new StringJoiner(", ");
    	String[] longMatch = match.patternName().split("\\.");
    	String action = "Action: " + longMatch[longMatch.length-1];
    	String actorName = "";
    	//action += ", Current state: " + this.s.getStateMachine().getRuntimestate().get(0).getActualState().getName();
    	sb.add(action);
    	//add dynamic entites from query
    	for(int i = 0 ; i < match.parameterNames().size(); i++) {
    		if(match.get(i).getClass().getSimpleName().equals("DynamicEntityImpl")) {
    			DynamicEntity de = (DynamicEntity) match.get(i);
    			actorName = de.getName();
    			s += " Entities: " + de.getName()+" :( ";
    			for(RegularAttribute a : de.getAttributes()) {
	            	s += a.getName() + ": "+ a.getValue();
	            	sb.add(s);	            	
    				s= "";
    			}
    			s += de.getName() + "Position: x: "+ de.getPosition().getX() + " y: " + de.getPosition().getY() + " Speed: x: "+ de.getSpeed().getX() + " y: " + de.getSpeed().getY();
    			

    			if(de.getOn() != null) {
    				s += ") Featured by:" + de.getOn().getName();
    				sb.add(s);
    			}else {
    				s+= ")";
    				sb.add(s);
    			}
    		}    		
    	}
    	for(RuntimeState r : this.s.getStateMachine().getRuntimestate()) {
    		if(r.getActor().equals(actorName)) {
    			//
    			sb.add(actorName + "'s current state: " + r.getActualState().getName());
    		}
    	}
    	
    	return sb.toString();
    }

}
