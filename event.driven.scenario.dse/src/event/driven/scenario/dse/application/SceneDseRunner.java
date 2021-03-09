package event.driven.scenario.dse.application;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchGenericBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;

import event.driven.scenario.dse.queries.GetCurrentState;
import event.driven.scenario.dse.rules.EdsdlDseRules;
import event.driven.scenario.dse.statecoder.SceneStateCoderFactory;
import event.driven.scenario.dl.edsdl.Action;
import event.driven.scenario.dl.edsdl.EdsdlFactory;
import event.driven.scenario.dl.edsdl.EdsdlPackage;
import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dl.edsdl.StateMachine;
import event.driven.scenario.dl.edsdl.Transition;

public class SceneDseRunner {

    public static void main(String[] args) throws ViatraQueryException {
    	
    	ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchGenericBackendFactory.INSTANCE);
    	ReteEngine.class.getClass();
    	
    	EdsdlPackage.eINSTANCE.eClass();
    	EdsdlFactory factory = EdsdlFactory.eINSTANCE;
    	
    	StateMachine m = factory.createStateMachine();
        
    	State sVAcc = factory.createState();
    	sVAcc.setName("Vehicle accelerates");
    	
    	State sVMov = factory.createState();
    	sVMov.setName("Vehicle moves");
    	
    	State sVSlo = factory.createState();
    	sVSlo.setName("Vehicle slows");
    	
    	Action vAcc = factory.createAction();
    	vAcc.setName("Accelerate");
    	vAcc.setChange("speed");
    	vAcc.setBy(1);
    	
    	Action vMov = factory.createAction();
    	vMov.setName("Move");
    	vMov.setChange("position");
    	vMov.setBy(1);
    	
    	Action vSlo = factory.createAction();
    	vSlo.setName("Slow down");
    	vSlo.setChange("speed");
    	vSlo.setBy(1);
    	
    	Transition vAcc_speedLimit = factory.createTransition();
    	vAcc_speedLimit.setTargetState(sVMov);
    	vAcc_speedLimit.setPattern("speedLimit");
    	vAcc_speedLimit.setAction(vMov);
    	
    	Transition vAcc_noSpeedLimit = factory.createTransition();
    	vAcc_noSpeedLimit.setTargetState(sVAcc);
    	vAcc_noSpeedLimit.setPattern("!speedLimit");
    	vAcc_noSpeedLimit.setAction(vAcc);
    	
    	Transition vMov_danger = factory.createTransition();
    	vMov_danger.setTargetState(sVSlo);
    	vMov_danger.setPattern("danger");
    	vMov_danger.setAction(vSlo);
    	
    	Transition vMov_noDanger = factory.createTransition();
    	vMov_noDanger.setTargetState(sVMov);
    	vMov_noDanger.setPattern("!danger");
    	vMov_noDanger.setAction(vMov);
    	
    	Transition vSlo_danger = factory.createTransition();
    	vSlo_danger.setTargetState(sVSlo);
    	vSlo_danger.setPattern("danger");
    	vSlo_danger.setAction(vSlo);
    	
    	Transition vSlo_noDanger = factory.createTransition();
    	vSlo_noDanger.setTargetState(sVAcc);
    	vSlo_noDanger.setPattern("!danger");
    	vSlo_noDanger.setAction(vAcc);
    	
    	sVAcc.getOutTransitions().add(vAcc_noSpeedLimit);
    	sVAcc.getOutTransitions().add(vAcc_speedLimit);
    	sVMov.getOutTransitions().add(vMov_noDanger);
    	sVMov.getOutTransitions().add(vMov_danger);
    	sVSlo.getOutTransitions().add(vSlo_noDanger);
    	sVSlo.getOutTransitions().add(vSlo_danger);
    	
    	m.setActualState(sVAcc);
    	
    	m.getActions().add(vSlo);
    	m.getActions().add(vAcc);
    	m.getActions().add(vMov);
    	
    	m.getStates().add(sVSlo);
    	m.getStates().add(sVAcc);
    	m.getStates().add(sVMov);
    	
    	m.getTransitions().add(vSlo_noDanger);
    	m.getTransitions().add(vSlo_danger);
    	m.getTransitions().add(vAcc_noSpeedLimit);
    	m.getTransitions().add(vAcc_speedLimit);
    	m.getTransitions().add(vMov_noDanger);
    	m.getTransitions().add(vMov_danger);        
       
    	/*
    	for(State s : m.getStates()) {
    		for(Transition t : s.getOutTransitions()) {
    			System.out.println(t.getTargetState().getName());
    		}
    		
    	}
    	*/
    	Scanner sc= new Scanner(System.in);
    	while(true) {
    		System.out.print("Current state: " + m.getActualState().getName()+". Possible transitions: ");
    		StringJoiner joiner = new StringJoiner(", ");
        		for(Transition t : m.getActualState().getOutTransitions()) {
        			joiner.add(t.getPattern());
        		}
        	
        	System.out.println(joiner+". Please type one in.");
        	String str= sc.nextLine();
        	for(Transition t : m.getActualState().getOutTransitions()) {
        		if(t.getPattern().equals(str)) {
        			m.setActualState(t.getTargetState());
        		}
        	}
        	if(str.equals("exit")) {
        		break;
        	}
    	}
    	sc.close();
    	
        /*
        DesignSpaceExplorer.turnOnLoggingWithBasicConfig(DseLoggingLevel.WARN);

        DesignSpaceExplorer dse = new DesignSpaceExplorer();

        dse.setInitialModel(m);
        dse.addMetaModelPackage(EdsdlPackage.eINSTANCE);
        
        dse.setStateCoderFactory(new SceneStateCoderFactory());
        //dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));

        EdsdlDseRules rules = new EdsdlDseRules();
        dse.addTransformationRule(rules.currentState);

        
        
        dse.addObjective(
                new ConstraintsObjective()
                        .withHardConstraint(GetCurrentState.instance())
                        .withComparator(Comparators.LOWER_IS_BETTER));

        
        dse.setSolutionStore(new SolutionStore().storeBestSolutionsOnly());

        dse.startExploration(Strategies.createDfsStrategy());

        System.out.println(dse.toStringSolutions());
    	 */
    }
}
