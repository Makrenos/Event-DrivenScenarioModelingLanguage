package event.driven.scenario.dse.application;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edsdl.Action;
import edsdl.Condition;
import edsdl.Dictionary;
import edsdl.EFeatureBasedAction;
import edsdl.EdsdlFactory;
import edsdl.EdsdlPackage;
import edsdl.RuntimeState;
import edsdl.State;
import edsdl.StateMachine;
import edsdl.Transition;
import scenedl.DynamicEntity;
import scenedl.Lane;
import scenedl.PositionAttribute;
import scenedl.RegularAttribute;
import scenedl.Scene;
import scenedl.ScenedlFactory;
import scenedl.ScenedlPackage;
import scenedl.StaticEntity;

public class InitInstanceModels {
	
	private EdsdlFactory edsdlFactory;
	private ScenedlFactory sceneFactory;
	private Resource.Factory.Registry reg;
	private Map<String, Object> mo;
	private ResourceSet resSet;
	private Resource resourceSave;
	
	public InitInstanceModels() {
		EdsdlPackage.eINSTANCE.eClass();
    	this.edsdlFactory = EdsdlFactory.eINSTANCE;
    	
    	ScenedlPackage.eINSTANCE.eClass();
    	this.sceneFactory = ScenedlFactory.eINSTANCE;
    	
    	this.reg = Resource.Factory.Registry.INSTANCE;
    	this.mo  = reg.getExtensionToFactoryMap();
    	this.resSet = new ResourceSetImpl(); 
	}
	
	public StateMachine initStateMachine(String name) {
		if(name.equals("vehicleMoves")) {
			return vehicleMoves();
		}
		return null;
	}
	
	public Scene initScene(String name,StateMachine m) {
		if(name.equals("oneVehicleWithPedestrian")) {
			return oneVehicleWithPedestrian(m);
		}
		return null;
	}
	
	public Scene oneVehicleWithPedestrian(StateMachine m) {
		Scene s = sceneFactory.createScene();
		
		PositionAttribute sceneBoundry = sceneFactory.createPositionAttribute();
		sceneBoundry.setX(8);
		sceneBoundry.setY(4);
		
		s.setBoundry(sceneBoundry);
		
    	//Car init
		DynamicEntity car = sceneFactory.createDynamicEntity();
		PositionAttribute carPos = sceneFactory.createPositionAttribute();
		RegularAttribute carSpeed = sceneFactory.createRegularAttribute();
		    		
		car.setName("ego");
		car.setType("dynamic_entity");
		carSpeed.setValue(1);
		carSpeed.setName("speed");
		
		carPos.setX(1);
		carPos.setY(2);
		
		car.setPosition(carPos);
		car.getAttributes().add(carSpeed);
		car.setContainedIn(s);
		
		//Lanes init
		Lane roadLane1 = sceneFactory.createLane();
		PositionAttribute roadLane1StartingPos = sceneFactory.createPositionAttribute();
		roadLane1StartingPos.setX(1);
		roadLane1StartingPos.setY(2);
		
		PositionAttribute roadLane1EndingPos = sceneFactory.createPositionAttribute();
		roadLane1EndingPos.setX(7);
		roadLane1EndingPos.setY(2);
		
		roadLane1.setEndingPosition(roadLane1EndingPos);
		roadLane1.setStartingPosition(roadLane1StartingPos);
		
		Lane roadLane2 = sceneFactory.createLane();
		PositionAttribute roadLane2StartingPos = sceneFactory.createPositionAttribute();
		roadLane2StartingPos.setX(1);
		roadLane2StartingPos.setY(3);
		
		PositionAttribute roadLane2EndingPos = sceneFactory.createPositionAttribute();
		roadLane2EndingPos.setX(7);
		roadLane2EndingPos.setY(3);
		
		roadLane2.setEndingPosition(roadLane2EndingPos);
		roadLane2.setStartingPosition(roadLane2StartingPos);
		
		//Road init
		StaticEntity road = sceneFactory.createStaticEntity();
		road.setName("road");
		road.setType("static_entity");
		road.getUses().add(car);
		
		road.getLanes().add(roadLane1);
		road.getLanes().add(roadLane2);
		
		road.setContainedIn(s);
		
        car.setOn(road);
        
        //Crosswalk init
        StaticEntity crosswalk = sceneFactory.createStaticEntity();
        crosswalk.setName("crosswalk");
        crosswalk.setType("static_entity");

        Lane crosswalkLane = sceneFactory.createLane();
		PositionAttribute crosswalkLaneStartingPos = sceneFactory.createPositionAttribute();
		crosswalkLaneStartingPos.setX(4);
		crosswalkLaneStartingPos.setY(2);
		
		PositionAttribute crosswalkLaneEndingPos = sceneFactory.createPositionAttribute();
		crosswalkLaneEndingPos.setX(4);
		crosswalkLaneEndingPos.setY(3);
		
		crosswalkLane.setEndingPosition(crosswalkLaneEndingPos);
		crosswalkLane.setStartingPosition(crosswalkLaneStartingPos);
        
		crosswalk.getLanes().add(crosswalkLane);
		
		crosswalk.setContainedIn(s);
        
        //Pedestrian init
        DynamicEntity pedestrian = sceneFactory.createDynamicEntity();
		PositionAttribute pedestrianPos = sceneFactory.createPositionAttribute();
		RegularAttribute pedestrianSpeed = sceneFactory.createRegularAttribute();
		    		
		pedestrian.setName("pedestrian");
		pedestrian.setType("dynamic_entity");
		pedestrianSpeed.setValue(1);
		pedestrianSpeed.setName("speed");
		
		pedestrianPos.setX(4);
		pedestrianPos.setY(4);
		
		pedestrian.setPosition(pedestrianPos);
		pedestrian.getAttributes().add(pedestrianSpeed);
		
		pedestrian.setContainedIn(s);
        
		//Set elements
		s.getElements().add(pedestrian);
		s.getElements().add(crosswalk);
		s.getElements().add(road);
		s.getElements().add(car);
		s.setName("One_vehicle_with_crosswalk_and_pedestrian");
        
		//Set state machine
		s.setStateMachine(m);
		
		saveStateMachine(s, "oneVehicleWithPedestrianScene", "scenedl");
		return s;
	}
	
	public StateMachine vehicleMoves() {
		StateMachine m = edsdlFactory.createStateMachine();
		
		Dictionary dic = edsdlFactory.createDictionary();
		
		//States
    	State sVAcc = edsdlFactory.createState();
    	sVAcc.setName("Accelerates");
    	
    	State sVMov = edsdlFactory.createState();
    	sVMov.setName("Moves");
    	
    	State sVSlo = edsdlFactory.createState();
    	sVSlo.setName("Slows");
    	
    	//RuntimeStates
		RuntimeState runtimeState = edsdlFactory.createRuntimeState();
		runtimeState.setActualState(sVAcc);
    	
		//Actions
    	Action vAcc = edsdlFactory.createAction();
    	vAcc.setName("vehicleAccelerates");
    	
    	EFeatureBasedAction vAccFeatureBased = edsdlFactory.createEFeatureBasedAction();
    	vAccFeatureBased.setName("vehicleAcceleratesFB");
    	vAccFeatureBased.setChange("speed");
    	vAccFeatureBased.setBy(1);
    	
    	Action vMov = edsdlFactory.createAction();
    	vMov.setName("vehicleMoves");
    	
    	EFeatureBasedAction vMovFeatureBased = edsdlFactory.createEFeatureBasedAction();
    	vMovFeatureBased.setName("vehicleMovesFB");
    	vMovFeatureBased.setChange("position");
    	vMovFeatureBased.setBy(1);
    	
    	Action vSlo = edsdlFactory.createAction();
    	vSlo.setName("vehicleSlowsDown");
    	
    	EFeatureBasedAction vSloFeatureBased = edsdlFactory.createEFeatureBasedAction();
    	vSloFeatureBased.setName("vehicleSlowsDownFB");
    	vSloFeatureBased.setChange("speed");
    	vSloFeatureBased.setBy(-1);
    	
    	Action pMov = edsdlFactory.createAction();
    	pMov.setName("pedestrianMoves");
    	
    	EFeatureBasedAction pMovFeatureBased = edsdlFactory.createEFeatureBasedAction();
    	pMovFeatureBased.setName("pedestrianMovesFB");
    	pMovFeatureBased.setChange("position");
    	pMovFeatureBased.setBy(1);
    	
    	//Conditions
    	Condition speedLimit = edsdlFactory.createCondition();
    	speedLimit.setPattern("speedLimit");
    	
    	Condition danger = edsdlFactory.createCondition();
    	danger.setPattern("danger");
    	
    	Condition no_speedLimit = edsdlFactory.createCondition();
    	no_speedLimit.setPattern("!speedLimit");
    	
    	Condition no_danger = edsdlFactory.createCondition();
    	no_danger.setPattern("!danger");
    	
    	Condition pedestrian_moves = edsdlFactory.createCondition();
    	pedestrian_moves.setPattern("pedestrianCanMove");
    	
    	//Transitions
    	Transition vAcc_speedLimit = edsdlFactory.createTransition();
    	vAcc_speedLimit.setTargetState(sVMov);
    	vAcc_speedLimit.setCondition(speedLimit);
    	vAcc_speedLimit.getRuleBasedActions().add(vMov);
    	vAcc_speedLimit.getFeatureBasedActions().add(vMovFeatureBased);
    	vAcc_speedLimit.setName("SpeedLimit");
    	
    	Transition vAcc_noSpeedLimit = edsdlFactory.createTransition();
    	vAcc_noSpeedLimit.setTargetState(sVAcc);
    	vAcc_noSpeedLimit.setCondition(no_speedLimit);
    	vAcc_noSpeedLimit.getRuleBasedActions().add(vAcc);
    	vAcc_noSpeedLimit.getFeatureBasedActions().add(vMovFeatureBased);
    	vAcc_noSpeedLimit.getFeatureBasedActions().add(vAccFeatureBased);
    	vAcc_noSpeedLimit.setName("NoSpeedLimit");
    	
    	Transition vMov_danger = edsdlFactory.createTransition();
    	vMov_danger.setTargetState(sVSlo);
    	vMov_danger.setCondition(danger);
    	vMov_danger.getRuleBasedActions().add(vSlo);
    	vMov_danger.getFeatureBasedActions().add(vSloFeatureBased);
    	vMov_danger.setName("Danger");
    	
    	Transition vMov_noDanger = edsdlFactory.createTransition();
    	vMov_noDanger.setTargetState(sVMov);
    	vMov_noDanger.setCondition(no_danger);
    	vMov_noDanger.getRuleBasedActions().add(vMov);
    	vMov_noDanger.getFeatureBasedActions().add(vMovFeatureBased);
    	vMov_noDanger.setName("NoDanger");
    	
    	Transition vSlo_danger = edsdlFactory.createTransition();
    	vSlo_danger.setTargetState(sVSlo);
    	vSlo_danger.setCondition(danger);
    	vSlo_danger.getRuleBasedActions().add(vSlo);
    	vSlo_danger.getFeatureBasedActions().add(vSloFeatureBased);
    	vSlo_danger.setName("Danger");
    	
    	Transition vSlo_noDanger = edsdlFactory.createTransition();
    	vSlo_noDanger.setTargetState(sVAcc);
    	vSlo_noDanger.setCondition(no_danger);
    	vSlo_noDanger.getRuleBasedActions().add(vAcc);
    	vSlo_noDanger.getFeatureBasedActions().add(vAccFeatureBased);
    	vSlo_noDanger.setName("NoDanger");
    	
    	Transition vSlo_pedestrian_moves = edsdlFactory.createTransition();
    	vSlo_pedestrian_moves.setTargetState(sVSlo);
    	vSlo_pedestrian_moves.setCondition(pedestrian_moves);
    	vSlo_pedestrian_moves.getRuleBasedActions().add(pMov);
    	vSlo_pedestrian_moves.getFeatureBasedActions().add(pMovFeatureBased);
    	vSlo_pedestrian_moves.setName("pedestrianMovesWhenSlowing");
    	
    	Transition vMov_pedestrian_moves = edsdlFactory.createTransition();
    	vMov_pedestrian_moves.setTargetState(sVMov);
    	vMov_pedestrian_moves.setCondition(pedestrian_moves);
    	vMov_pedestrian_moves.getRuleBasedActions().add(pMov);
    	vMov_pedestrian_moves.getFeatureBasedActions().add(pMovFeatureBased);
    	vMov_pedestrian_moves.setName("pedestrianMovesWhenVehicleMoves");
    	
    	Transition vAcc_pedestrian_moves = edsdlFactory.createTransition();
    	vAcc_pedestrian_moves.setTargetState(sVAcc);
    	vAcc_pedestrian_moves.setCondition(pedestrian_moves);
    	vAcc_pedestrian_moves.getRuleBasedActions().add(pMov);
    	vAcc_pedestrian_moves.getFeatureBasedActions().add(pMovFeatureBased);
    	vAcc_pedestrian_moves.setName("pedestrianMovesWhenAccelerates");
    	
    	//Set Transitions
    	sVAcc.getOutTransitions().add(vAcc_noSpeedLimit);
    	sVAcc.getOutTransitions().add(vAcc_speedLimit);
    	sVAcc.getOutTransitions().add(vAcc_pedestrian_moves);
    	sVMov.getOutTransitions().add(vMov_noDanger);
    	sVMov.getOutTransitions().add(vMov_danger);
    	sVMov.getOutTransitions().add(vMov_pedestrian_moves);
    	sVSlo.getOutTransitions().add(vSlo_noDanger);
    	sVSlo.getOutTransitions().add(vSlo_danger);
    	sVSlo.getOutTransitions().add(vSlo_pedestrian_moves);
    	
    	//Set Dictionary
    	m.setDictionary(dic);
    	
    	//Set Runtime
    	m.getRuntimestate().add(runtimeState);
    	
    	//Set Actions
    	dic.getRuleBasedActions().add(vSlo);
    	dic.getRuleBasedActions().add(vAcc);
    	dic.getRuleBasedActions().add(vMov);
    	dic.getRuleBasedActions().add(pMov);
    	
    	dic.getFeatureBasedActions().add(vSloFeatureBased);
    	dic.getFeatureBasedActions().add(vAccFeatureBased);
    	dic.getFeatureBasedActions().add(vMovFeatureBased);
    	dic.getFeatureBasedActions().add(pMovFeatureBased);
    	
    	//Set Conditions
    	dic.getConditions().add(no_danger);
    	dic.getConditions().add(no_speedLimit);
    	dic.getConditions().add(danger);
    	dic.getConditions().add(speedLimit);
    	dic.getConditions().add(pedestrian_moves);
    	
    	//Set States
    	m.getStates().add(sVSlo);
    	m.getStates().add(sVAcc);
    	m.getStates().add(sVMov);
    	
    	saveStateMachine(m,"vehicleMovesStateMachine","edsdl");
    	
    	return m;	
	}
	
	private void saveStateMachine(EObject model,String name,String extension) {    	
    	mo.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
    	mo.put(extension, new XMIResourceFactoryImpl());
    	
    	resourceSave = resSet.createResource(URI.createFileURI("./models/"+name+"."+extension));
    	resourceSave.getContents().add(model);
    	try {
    		resourceSave.save(mo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mo.clear();
	}
}
