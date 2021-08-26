package event.driven.scenario.dse.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel;
import org.eclipse.viatra.dse.api.strategy.impl.DepthFirstStrategy;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.objectives.impl.ModelQueryType;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchGenericBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;

import behavior.BehaviorFactory;
import behavior.BehaviorList;
import behavior.BehaviorPackage;
import behavior.ListsOfBehaviors;
import behavior.Parameter;
import edsdl.StateMachine;
import event.driven.scenario.dse.source.StateTransitionBasedConstraintsObjective;
import event.driven.scenario.dse.source.StateTransitionBasedDesignSpaceExplorer;
import event.driven.scenario.dse.source.StateTransitionBasedDfsStrategy;
import event.driven.scenario.dse.source.StateTransitionBasedSolutionStore;
import event.driven.scenario.dse.statecoder.SceneStateCoderFactory;
import behavior.Behavior;
import scenedl.Scene;
import scenedl.ScenedlPackage;
import trafficSituation.Scenario;
import trafficSituation.TrafficSituationFactory;
import trafficSituation.TrafficSituationPackage;

public class Scenic_Behavior_DSE_Generator {

    public static void main(String[] args) throws ViatraQueryException {
    	
    	InitInstanceModels init = new InitInstanceModels();
    	
    	//Initialization
    	ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchGenericBackendFactory.INSTANCE);
    	ReteEngine.class.getClass();
    	
    	BehaviorPackage.eINSTANCE.eClass();
    	BehaviorFactory behaviorFactory = BehaviorFactory.eINSTANCE;
    	
    	TrafficSituationPackage.eINSTANCE.eClass();
    	TrafficSituationFactory trafficSituationFactory = TrafficSituationFactory.eINSTANCE;
    	

    	ListsOfBehaviors b = behaviorFactory.createListsOfBehaviors();
    	Scenario s = trafficSituationFactory.createScenario();
    	
    	XMIResourceImpl resource = new XMIResourceImpl();
    	
    	//TODO:
    	try {
    		
    		File source = new File("./models/simpleVoyageAutoScene.xmi");
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
    	    	s = (Scenario)resource.getContents().get(0);	
    		}
    	}catch (RuntimeException e){}
    		
    	//Create instance model if there is no valid XMI resource to load
    	if (s.getScenes().size() == 0){
    		System.out.println("Not loading");    	
    	}
    	
    	//XMI Resource initialization	
    	XMIResourceImpl behaviorResource = new XMIResourceImpl();
    	
    	//Read in XMI resource if there is any
    	try {
    		File source = new File("./models/behaviors.behavior");
        	try {
        		behaviorResource.load( new FileInputStream(source.getAbsolutePath()), new HashMap<Object,Object>());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    		if (behaviorResource != null)
    	    	b = (ListsOfBehaviors)behaviorResource.getContents().get(0);
    		}catch (RuntimeException e){
    		}
    		
    	//Create instance model if there is no valid XMI resource to load
    	if (b.getAllBehaviors().size() == 0){
    		System.out.println("New BehaviorList init");
    		//In order for the references to the actors the model Must contain the Scenario in it.
    		b = init.initBehaviors("scenicBehaviors",s);    		
    	}
    	System.out.println(b.getAllBehaviors().get(0).getName());
    	
    	//DSE
        DesignSpaceExplorer.turnOnLoggingWithBasicConfig(DseLoggingLevel.WARN);

        DesignSpaceExplorer dse = new DesignSpaceExplorer();

        dse.setInitialModel(s);
        dse.addMetaModelPackage(ScenedlPackage.eINSTANCE);
        
        dse.setStateCoderFactory(new SceneStateCoderFactory());

        ScenicDse rules = new ScenicDseRules();
        dse.addTransformationRule(rules.vehicleMoves);
        dse.addTransformationRule(rules.vehicleAccelerates);
        dse.addTransformationRule(rules.vehicleSlowsDown);
        dse.addTransformationRule(rules.pedestrianMoves);
        
        dse.addObjective(
                new ConstraintsObjective()
                		//.withHardConstraint(NoCollision.instance())
                        .withHardConstraint(EgoReachesRoadEndWithPedestrian.instance(),ModelQueryType.MUST_HAVE_MATCH)
                        .withComparator(Comparators.HIGHER_IS_BETTER));
        //global constraint -> eldobja ha illeszkedés van

        //save found instance models
        dse.setSolutionStore(new SolutionStore(10000).acceptAnySolutions().saveModelWhenFound("/vehicleReachesRoadEndWithPedestrian/vehicleReachesRoadEndWithPedestrian","scenedl"));

    	System.out.println("Exploration start");
    	final long startTime = System.nanoTime();
    	DepthFirstStrategy strategy = new DepthFirstStrategy(1000);
        dse.startExploration(strategy);
        
        System.out.println("Exploration start runtime: " + ((float)(System.nanoTime()-startTime))/1000 + " microseconds");
        //System.out.println(strategy.time);
        
        System.out.println(dse.toStringSolutions());
    }
}
