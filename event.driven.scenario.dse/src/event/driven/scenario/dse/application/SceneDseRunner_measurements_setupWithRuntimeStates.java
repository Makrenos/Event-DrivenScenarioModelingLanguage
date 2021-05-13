package event.driven.scenario.dse.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ModelQueryType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchGenericBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;


import edsdl.EdsdlFactory;
import edsdl.EdsdlPackage;
import edsdl.StateMachine;
import event.driven.scenario.dse.queries.EgoReachesRoadEndWithPedestrian;
import event.driven.scenario.dse.rules.EdsdlDseRules;
import event.driven.scenario.dse.rules.EdsdlDseRulesTEST;
import event.driven.scenario.dse.source.StateTransitionBasedDfsStrategy;
import event.driven.scenario.dse.source.StateTransitionBasedDfsStrategyTEST;
import event.driven.scenario.dse.source.StateTransitionBasedConstraintsObjective;
import event.driven.scenario.dse.source.StateTransitionBasedDesignSpaceExplorer;
import event.driven.scenario.dse.source.StateTransitionBasedSolutionStore;
import event.driven.scenario.dse.statecoder.SceneStateCoderFactory;
import scenedl.Scene;
import scenedl.ScenedlFactory;
import scenedl.ScenedlPackage;

public class SceneDseRunner_measurements_setupWithRuntimeStates {

    public static void main(String[] args) throws ViatraQueryException {
    	
    	InitInstanceModels init = new InitInstanceModels();
    	
    	//Initialization
    	ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchGenericBackendFactory.INSTANCE);
    	ReteEngine.class.getClass();
    	
    	EdsdlPackage.eINSTANCE.eClass();
    	EdsdlFactory factory = EdsdlFactory.eINSTANCE;
    	
    	ScenedlPackage.eINSTANCE.eClass();
    	ScenedlFactory sceneFactory = ScenedlFactory.eINSTANCE;
    	
    	StateMachine m = factory.createStateMachine();
    	
    	Scene s = sceneFactory.createScene();

    	//State Machine
    	//XMI Resource initialization

    	XMIResourceImpl resource = new XMIResourceImpl();

    	//Read in XMI resource if there is any
    	try {
    		
    		File source = new File("./models/vehicleMovesStateMachineTEST.edsdl");
        	try {
				resource.load( new FileInputStream(source.getAbsolutePath()), new HashMap<Object,Object>());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    		if (resource != null) {
    	    	m = (StateMachine)resource.getContents().get(0);	
    		}
    	}catch (RuntimeException e){}
    		
    	//Create instance model if there is no valid XMI resource to load
    	if (m.getStates().size() == 0){
    		System.out.println("New state machine init");
    		m = init.initStateMachine("vehicleMoves");    	
    	}
    	
    	//Scene
    	//XMI Resource initialization	
    	XMIResourceImpl sceneResource = new XMIResourceImpl();
    	
    	//Read in XMI resource if there is any
    	try {
    		File source = new File("./models/oneVehicleWithPedestrianSceneTEST.scenedl");
        	try {
        		sceneResource.load( new FileInputStream(source.getAbsolutePath()), new HashMap<Object,Object>());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    		if (sceneResource != null)
    	    	s = (Scene)sceneResource.getContents().get(0);
    		}catch (RuntimeException e){
    		}
    		
    	//Create instance model if there is no valid XMI resource to load
    	if (s.getElements().size() == 0){
    		System.out.println("New scene init");
    		s = init.initScene("oneVehicleWithPedestrian", m);    		
    	}

    	
    	s.setStateMachine(m);
        //DSE
        DesignSpaceExplorer.turnOnLoggingWithBasicConfig(DseLoggingLevel.WARN);
        String[] totalRuntime = new String[10];
        String[] machineRuntime = new String[10];
        int i = 0;
        while(i < 13) {
	        StateTransitionBasedDesignSpaceExplorer dse = new StateTransitionBasedDesignSpaceExplorer();
	
	        dse.setInitialModel(s);
	        dse.addMetaModelPackage(ScenedlPackage.eINSTANCE);
	        
	        dse.setStateCoderFactory(new SceneStateCoderFactory());
	
	        EdsdlDseRulesTEST rules = new EdsdlDseRulesTEST();
	        dse.addTransformationRule(rules.vehicleMovesTEST);
	        dse.addTransformationRule(rules.vehicleAcceleratesTEST);
	        dse.addTransformationRule(rules.vehicleSlowsDownTEST);
	        dse.addTransformationRule(rules.pedestrianMoves);
	        
	        dse.addObjective(
	                new StateTransitionBasedConstraintsObjective()
	                		//.withHardConstraint(NoCollision.instance())
	                        .withHardConstraint(EgoReachesRoadEndWithPedestrian.instance(),ModelQueryType.MUST_HAVE_MATCH)
	                        .withComparator(Comparators.HIGHER_IS_BETTER));
	        //global constraint -> eldobja ha illeszkedés van
	
	        //save found instance models
	        //dse.setSolutionStore(new StateTransitionBasedSolutionStore(10).acceptAnySolutions().saveModelWhenFound("/vehicleReachesRoadEndWithPedestrianTEST/vehicleReachesRoadEndWithPedestrian","scenedl"));
	        dse.setSolutionStore(new StateTransitionBasedSolutionStore(100000).acceptAnySolutions());
	        StateTransitionBasedDfsStrategyTEST strategy = new StateTransitionBasedDfsStrategyTEST(10000);
	    	//System.out.println("Exploration start");
	    	final long startTime = System.nanoTime();
	    	
	        dse.startExploration(strategy);
	        /*
	        System.out.println("Exploration runtime: " + ((float)(System.nanoTime()-startTime))/1000000000 + " seconds");
	        System.out.println("Statemachine runtime: " + (strategy.time+rules.time) + " seconds");
	        
	        while(!dse.isDone()) {}
	        */
        	if(i>2) {
        		totalRuntime[i-3] = String.valueOf(((float)(System.nanoTime()-startTime))/1000000000);
        		machineRuntime[i-3] = String.valueOf((strategy.time+rules.time));
        		System.out.println("Exploration runtime: " + ((float)(System.nanoTime()-startTime))/1000000000 + " seconds");
        		System.out.println("Statemachine runtime: " + (strategy.time+rules.time) + " seconds");
        	}
        	
        	if(i == 0) {
            	String[] lines = dse.toStringSolutions().split("\r\n|\r|\n");
    	        String[] result = dse.toStringSolutions().split("\n", 2);
    	        String[] splited = result[0].split("\\s+");
    	        int numberOfSollutions = Integer.parseInt(splited[splited.length-1]);
                System.out.println(result[0]);
                System.out.println("Trajectorys: "+ (lines.length-1-numberOfSollutions));
        	}

        	System.out.println(dse.toStringSolutions());
        	i++;
        	System.gc();
        	System.gc();
        	System.gc();
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        System.out.println(Arrays.toString(totalRuntime));
        System.out.println(Arrays.toString(machineRuntime));
    	
    }
}
