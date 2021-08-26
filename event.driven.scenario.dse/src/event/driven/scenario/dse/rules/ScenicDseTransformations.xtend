package event.driven.scenario.dse.rules

import org.eclipse.viatra.dse.api.DSEException
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory

import edsdl.Transition
import edsdl.Action
import scenedl.DynamicEntity
import scenedl.Element
import scenedl.Lane
import scenedl.StaticEntity
import trafficSituation.IsPlacedOn
import event.driven.scenario.dse.queries.LaneChangeBehavior

class ScenicDseTransformations {
    extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory

	//rules
    public BatchTransformationRule<?, ?> followLaneBehavior
    public BatchTransformationRule<?, ?> laneChangeBehavior

public float time;

	
	def void actuateModel(DynamicEntity de,String rule){
		//Actutate "on" reference
		var outOfFeatureZone = true;
        for(Element e : de.containedIn.elements) {
            if(e.getType().equals("static_entity")) {
               	var se =  e as StaticEntity;
               	var seStartPos = se.lanes.get(0).startingPosition;
               	var seEndPos = se.lanes.get(0).endingPosition;
               	for(Lane a : se.lanes) {
               		if(a.startingPosition.x < seStartPos.x) {
                		seStartPos = a.startingPosition;
                	}
					if(a.endingPosition.y > seEndPos.y) {
                		seEndPos = a.endingPosition;
                	}
                }
                if(de.position.x >= seStartPos.x && de.position.x <= seEndPos.x && de.position.y >= seStartPos.y && de.position.y <= seEndPos.y) {
                	outOfFeatureZone = false;
                	de.on = se;
                }		
            }		
        }
        if(outOfFeatureZone) {
        	de.on = null;
        }
        
        var startTime = System.nanoTime();
        //Actutate state
        if(de.name.equals("ego")){
        	
        	for(Transition t : de.containedIn.getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions()) {
    		for(Action a : t.getRuleBasedActions()) {
            	if (a.getName().equals(rule)) {
            		//System.out.println(de.name+t.getTargetState().name);		
            		de.containedIn.getStateMachine().getRuntimestate().get(0).setActualState(t.getTargetState());
            		//System.out.println(de.containedIn.getStateMachine().getRuntimestate().get(0).actualState.name);
            	}
    		}
    		}
        }
        time += ((System.nanoTime()-startTime) as float)/1000000000 ;
         
	}
	
    new() {
        try {
			laneChangeBehavior = createRule(LaneChangeBehavior.instance())
                .name("laneChangeBehavior")
                .action[
                	
                	if(sc.leftLane !== null){
                		adc.relations
                	}
                	//add behavior to the actor
                	//behavior parameters with lane name
                	//modify model like a hypotetical model -> actorhoz letezik egy isPlacedOn -> ekkor keruljon at a Path->followingPath-ra
                ]
                .build
                
            followLaneBehavior = createRule(FollowLaneBehavior.instance())
                .name("followLaneBehavior")
                .action[
                	//add behavior to the actor
                	//behavior parameters with lane name
                	//modify model like a hypotetical model -> actorhoz letezik egy isPlacedOn -> ekkor keruljon at a Path->followingPath-ra
                ]
                .build
			
        } catch (ViatraQueryException e) {
            throw new DSEException(e)
        }
    }
}
