package event.driven.scenario.dse.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
import event.driven.scenario.dse.queries.EgoReachesRoadEndWithPedestrianMeasurement;
import event.driven.scenario.dse.queries.InScene;
import event.driven.scenario.dse.rules.EdsdlDseRules;
import event.driven.scenario.dse.source.StateTransitionBasedDfsStrategy;
import event.driven.scenario.dse.source.StateTransitionBasedConstraintsObjective;
import event.driven.scenario.dse.source.StateTransitionBasedDesignSpaceExplorer;
import event.driven.scenario.dse.source.StateTransitionBasedSolutionStore;
import event.driven.scenario.dse.statecoder.SceneStateCoderFactory;
import scenedl.Scene;
import scenedl.ScenedlFactory;
import scenedl.ScenedlPackage;

public class SceneDseRunner_measurements_setup {

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
    		
    		File source = new File("./models/vehicleMovesStateMachineMeasurement.edsdl");
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
    		File source = new File("./models/oneVehicleWithPedestrianScene4Lanes.scenedl");
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

        int i = 0;
        while(i < 13) {
        	
        	StateTransitionBasedDesignSpaceExplorer dse = new StateTransitionBasedDesignSpaceExplorer();

            dse.setInitialModel(s);
            dse.addMetaModelPackage(ScenedlPackage.eINSTANCE);
            
            dse.setStateCoderFactory(new SceneStateCoderFactory());

            EdsdlDseRules rules = new EdsdlDseRules();
            dse.addTransformationRule(rules.randomVehicleMovesMeasurements);
            dse.addTransformationRule(rules.vehicleMoves);
            dse.addTransformationRule(rules.vehicleAccelerates);
            dse.addTransformationRule(rules.vehicleSlowsDown);
            dse.addTransformationRule(rules.pedestrianMoves);
            
            dse.addObjective(
                    new StateTransitionBasedConstraintsObjective()
                    		//.withHardConstraint(InScene.instance())
                            .withHardConstraint(EgoReachesRoadEndWithPedestrianMeasurement.instance(),ModelQueryType.MUST_HAVE_MATCH)
                            .withComparator(Comparators.HIGHER_IS_BETTER));
            //global constraint -> eldobja ha illeszkedés van

            //save found instance models
            //lot of sollutions -> into thesis
            //dse.setSolutionStore(new StateTransitionBasedSolutionStore(100000).acceptAnySolutions().saveModelWhenFound("/vehicleReachesRoadEndWithPedestrianMeasurements/vehicleReachesRoadEndWithPedestrianMeasurements","scenedl"));
            
            dse.setSolutionStore(new StateTransitionBasedSolutionStore(100000).acceptAnySolutions().saveModelWhenFound("/vehicleReachesRoadEndWithPedestrianMeasurements/vehicleReachesRoadEndWithPedestrianMeasurements","scenedl"));
        	
        	
        	//System.out.println("Exploration start:" + startTime);
        	StateTransitionBasedDfsStrategy strat = new StateTransitionBasedDfsStrategy(10000);
        	final long startTime = System.nanoTime();
        	dse.startExploration(strat);
        	while(!dse.isDone()) {}
        	if(i>2) {
        		System.out.println("Exploration runtime: " + ((float)(System.nanoTime()-startTime))/1000000 + " milliseconds");
        		//System.out.println("Statemachine runtime: " + strat.time + " milliseconds");
        	}
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
        
        
        //System.out.println(dse.toStringSolutions());
        /*
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("vehicleReachesRoadEndWithPedestrianMeasurementsSollutions.txt"));
			dse.getSolutions().iterator().next();
			writer.write(dse.toStringSolutions());
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		*/ 
        //System.out.println(dse.toStringSolutions());
    	
    }
}
