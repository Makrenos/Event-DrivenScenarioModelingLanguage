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
import event.driven.scenario.dse.queries.VehicleMovesMeasurements
import event.driven.scenario.dse.queries.VehicleSlowsDownMeasurements
import event.driven.scenario.dse.queries.VehicleAcceleratesMeasurements
import event.driven.scenario.dse.queries.RandomVehicleMovesMeasurements

class EdsdlDseRules {
    extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory

	//rules
    public BatchTransformationRule<?, ?> vehicleMoves
    public BatchTransformationRule<?, ?> vehicleSlowsDown
    public BatchTransformationRule<?, ?> vehicleAccelerates    
	public BatchTransformationRule<?, ?> pedestrianMoves
	
	//measurements
	public BatchTransformationRule<?, ?> vehicleMovesMeasurements
    public BatchTransformationRule<?, ?> vehicleSlowsDownMeasurements
    public BatchTransformationRule<?, ?> vehicleAcceleratesMeasurements
    public BatchTransformationRule<?, ?> randomVehicleMovesMeasurements

	/*
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
	*/
	
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
			vehicleMoves = createRule(VehicleMoves.instance())
                .name("vehicleMoves")
                .action[						
					vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
					vehicle.actuateModel(vehicleMoves.name) 	    
                ]
                .build
                
            vehicleSlowsDown = createRule(VehicleSlowsDown.instance())
                .name("vehicleSlowsDown")
                .action[                	
                	//val featureX = vehiclePos.eClass.EAllStructuralFeatures.filter[it.name.equals("x")].head
                	//map a by megszerzéséhez
                	//vehiclePos.eSet(featureX,1);s
                	//vehicle.position.x
                	vehicle.speed.x = vehicle.speed.x + by 
                	vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
					//vehicle.position.x = vehicle.position.x + vehicle.setSpeed(by)
                	vehicle.actuateModel(vehicleSlowsDown.name)                	    
                ]
                .build
                
            vehicleAccelerates = createRule(VehicleAccelerates.instance())
                .name("vehicleAccelerates")
                .action[            	
					vehicle.speed.x = vehicle.speed.x + by 
                	vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
                	vehicle.actuateModel(vehicleAccelerates.name)                	    
                ]
                .build


			pedestrianMoves = createRule(PedestrianMoves.instance())
                .name("pedestrianMoves")
                .action[
                	//System.out.println(pedestrian.name);
                	pedestrian.position.x = pedestrian.position.x + pedestrian.speed.x
					pedestrian.position.y = pedestrian.position.y + pedestrian.speed.y
					pedestrian.actuateModel(pedestrianMoves.name)
                ]
                .build
                
            //Measurements
			vehicleMovesMeasurements = createRule(VehicleMovesMeasurements.instance())
                .name("vehicleMoves")
                .action[
                	//System.out.println(vehicle.name);						
					vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
					vehicle.actuateModel(vehicleMoves.name) 	    
                ]
                .build
                
			randomVehicleMovesMeasurements = createRule(RandomVehicleMovesMeasurements.instance())
                .name("randomVehicleMoves")
                .action[
                	//System.out.println(vehicle.name);						
					vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
					vehicle.actuateModel(vehicleMoves.name) 	    
                ]
                .build
                
            vehicleSlowsDownMeasurements = createRule(VehicleSlowsDownMeasurements.instance())
                .name("vehicleSlowsDown")
                .action[
                	//System.out.println(vehicle.name);	                	
                	//val featureX = vehiclePos.eClass.EAllStructuralFeatures.filter[it.name.equals("x")].head
                	//map a by megszerzéséhez
                	//vehiclePos.eSet(featureX,1);
                	//vehicle.position.x
					vehicle.speed.x = vehicle.speed.x + by 
                	vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
                	vehicle.actuateModel(vehicleSlowsDown.name)                	    
                ]
                .build
                
            vehicleAcceleratesMeasurements = createRule(VehicleAcceleratesMeasurements.instance())
                .name("vehicleAccelerates")
                .action[
                	//System.out.println(vehicle.name);            	
					vehicle.speed.x = vehicle.speed.x + by 
                	vehicle.position.x = vehicle.position.x + vehicle.speed.x
					vehicle.position.y = vehicle.position.y + vehicle.speed.y
                	vehicle.actuateModel(vehicleAccelerates.name)                	    
                ]
                .build    
			
        } catch (ViatraQueryException e) {
            throw new DSEException(e)
        }
    }
}
