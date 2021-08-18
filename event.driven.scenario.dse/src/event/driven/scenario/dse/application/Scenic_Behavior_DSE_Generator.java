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
import edsdl.StateMachine;
import behavior.Behavior;



import event.driven.scenario.dse.rules.EdsdlDseRules;
import event.driven.scenario.dse.source.StateTransitionBasedDfsStrategy;
import event.driven.scenario.dse.source.StateTransitionBasedConstraintsObjective;
import event.driven.scenario.dse.source.StateTransitionBasedDesignSpaceExplorer;
import event.driven.scenario.dse.source.StateTransitionBasedSolutionStore;
import event.driven.scenario.dse.statecoder.SceneStateCoderFactory;
import trafficSituation.TrafficSituationFactory;
import trafficSituation.TrafficSituationPackage;

public class Scenic_Behavior_DSE_Generator {

    public static void main(String[] args) throws ViatraQueryException {
    	
    	//InitInstanceModels init = new InitInstanceModels();
    	
    	//Initialization
    	ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchGenericBackendFactory.INSTANCE);
    	ReteEngine.class.getClass();
    	
    	BehaviorPackage.eINSTANCE.eClass();
    	BehaviorFactory behaviorFactory = BehaviorFactory.eINSTANCE;
    	
    	TrafficSituationPackage.eINSTANCE.eClass();
    	TrafficSituationFactory trafficSituationFactory = TrafficSituationFactory.eINSTANCE;
    	

    	BehaviorList b = behaviorFactory.createBehaviorList();
    	
    	XMIResourceImpl resource = new XMIResourceImpl();
    	
    	
    	//TODO:
    	try {
    		
    		File source = new File("./models/vehicleMovesStateMachine.edsdl");
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
    	//end of TODO
    }
}
