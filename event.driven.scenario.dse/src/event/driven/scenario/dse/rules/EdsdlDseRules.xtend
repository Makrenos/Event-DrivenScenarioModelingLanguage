package event.driven.scenario.dse.rules

import org.eclipse.viatra.dse.api.DSEException
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import event.driven.scenario.dse.queries.VehicleMoves
import event.driven.scenario.dse.queries.PedestrianMoves
import edsdl.Transition
import edsdl.Action
import event.driven.scenario.dse.queries.VehicleSlowsDown
import scenedl.RegularAttribute
import event.driven.scenario.dse.queries.VehicleAccelerates
import scenedl.DynamicEntity
import scenedl.Element
import scenedl.Lane
import scenedl.StaticEntity

class EdsdlDseRules {
    extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory

	//rules
    public BatchTransformationRule<?, ?> vehicleMoves
    public BatchTransformationRule<?, ?> vehicleSlowsDown
    public BatchTransformationRule<?, ?> vehicleAccelerates
	public BatchTransformationRule<?, ?> pedestrianMoves

	def int getSpeed(DynamicEntity e){
		for(RegularAttribute a : e.attributes){
			if(a.name.equals("speed")){
				
				return a.value;
			}
		}
		return 0
	}
	
	def int setSpeed(DynamicEntity e,int by){
		for(RegularAttribute a : e.attributes){
			if(a.name.equals("speed")){
				a.value = a.value+by
				return a.value
			}
		}
		return 0
	}
	
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
        
        //Actutate state        
        for(Transition t : de.containedIn.getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions()) {
    		for(Action a : t.getRuleBasedActions()) {
            	if (a.getName().contains(rule)) {
            		de.containedIn.getStateMachine().getRuntimestate().get(0).setActualState(t.getTargetState());
            	}
    		}
    	} 
	}
	
    new() {
        try {
			vehicleMoves = createRule
                .name("vehicleMoves")
                .precondition(VehicleMoves.instance())
                .action[						
					vehiclePos.x = vehiclePos.x + vehicle.getSpeed
					vehicle.actuateModel("vehicleMoves") 	    
                ]
                .build
                
            vehicleSlowsDown = createRule
                .name("vehicleSlowsDown")
                .precondition(VehicleSlowsDown.instance())
                .action[                	
                	//val featureX = vehiclePos.eClass.EAllStructuralFeatures.filter[it.name.equals("x")].head
                	//map a by megszerzéséhez
                	//vehiclePos.eSet(featureX,1);
                	
					vehiclePos.x = vehiclePos.x + vehicle.setSpeed(by)
                	vehicle.actuateModel("vehicleSlowsDown")                	    
                ]
                .build
                
            vehicleAccelerates = createRule
                .name("vehicleAccelerates")
                .precondition(VehicleAccelerates.instance())
                .action[            	
					vehiclePos.x = vehiclePos.x + vehicle.setSpeed(by)
                	vehicle.actuateModel("vehicleAccelerates")                	    
                ]
                .build


			pedestrianMoves = createRule
                .name("pedestrianMoves")
                .precondition(PedestrianMoves.instance())
                .action[
					pedestrianPos.y = pedestrianPos.y + pedestrian.getSpeed
					pedestrian.actuateModel("pedestrianMoves")
                ]
                .build    
			
        } catch (ViatraQueryException e) {
            throw new DSEException(e)
        }
    }
}
