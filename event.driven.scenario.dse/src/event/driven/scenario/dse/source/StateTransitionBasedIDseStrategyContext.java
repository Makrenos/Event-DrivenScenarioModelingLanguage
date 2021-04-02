package event.driven.scenario.dse.source;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;
import org.eclipse.viatra.transformation.evm.api.RuleSpecification;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

public interface StateTransitionBasedIDseStrategyContext {
	void init();
    
    Notifier getModel();
    EditingDomain getEditingDomain();
    ViatraQueryEngine getQueryEngine();
    RuleEngine getRuleEngine();
    StateTransitionBasedIStrategy getStrategy();
    StateTransitionBasedExplorerThread getExplorerThread();
    List<StateTransitionBasedIObjective> getObjectives();
    StateTransitionBasedIObjective[][] getLeveledObjectives();
    List<StateTransitionBasedIGlobalConstraint> getGlobalConstraints();
    
    StateTransitionBasedSolutionStore getSolutionStore();
    void newSolution();
// TODO void newSolution(TrajectoryFitness trajectoryFitness);
    
    
    StateTransitionBasedObjectiveComparatorHelper getObjectiveComparatorHelper();

    StateTransitionBasedGlobalContext getGlobalContext();
    Set<BatchTransformationRule<?, ?>> getRules();
    BatchTransformationRule<?, ?> getRuleByRuleSpecification(RuleSpecification<?> ruleSpecification);
    StateTransitionBasedExplorerThread tryStartNewThread(StateTransitionBasedIStrategy strategy); /*IDseStrategyContext originalContext*/
    StateTransitionBasedExplorerThread tryStartNewThreadWithoutModelClone(StateTransitionBasedIStrategy strategy);
    void startAllThreads(StateTransitionBasedIStrategyFactory strategyFactory);
    Object getSharedObject();
    void setSharedObject(Object sharedObject);
    
    
    StateTransitionBasedDesignSpaceManager getDesignSpaceManager();
    IStateCoder getStateCoder();
    IDesignSpace getDesignSpace();
    TrajectoryInfo getTrajectoryInfo();
    List<Object> getTrajectory();
    List<Object> getTrajectoryCopied();
    int getDepth();
    Object getCurrentStateId();

    Object getTransitionByActivation(Activation<?> activation);
    Activation<?> getActivationById(Object activationId);
    BatchTransformationRule<?, ?> getRuleByActivation(Activation<?> activation);
    BatchTransformationRule<?, ?> getRuleByActivationId(Object activationId);
    
    Collection<Object> getCurrentActivationIds();
    Collection<Object> getUntraversedActivationIds();
// TODO Object getArbitraryActivationId();
// TODO Object getArbitraryUntraversedActivationId();

    void executeAcitvationId(Object activationId);
    boolean tryExecuteAcitvationId(Object activationId);
    boolean executeRandomActivationId();
    void executeTrajectory(Object[] activationIds);
    void executeTrajectory(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex);
    int executeTrajectoryByTrying(Object[] activationIds);
    int executeTrajectoryByTrying(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex);
    int executeTrajectoryWithoutStateCoding(Object[] activationIds);
    int executeTrajectoryWithoutStateCoding(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex);
    int executeTrajectoryByTryingWithoutStateCoding(Object[] activationIds);
    int executeTrajectoryByTryingWithoutStateCoding(Object[] activationIds, int fromIncludedIndex, int toExcludedIndex);
    void executeTrajectoryWithMinimalBacktrack(Object[] trajectory);
    void executeTrajectoryWithMinimalBacktrack(Object[] trajectory, int toExcludedIndex);
    void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory);
    void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory, int toExcludedIndex);

    boolean backtrack();
 // TODO int backtrack(int times);
    void backtrackUntilLastCommonActivation(Object[] trajectory);
    void backtrackUntilRoot();

    Fitness calculateFitness();
    Fitness getLastFitness();
    boolean checkGlobalConstraints();
    boolean isCurrentStateAlreadyTraversed();
    // this needs states stored:
    boolean isCurrentStateInTrajectory();
}
