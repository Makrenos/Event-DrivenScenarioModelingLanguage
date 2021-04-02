package event.driven.scenario.dse.source;

import java.util.Comparator;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IObjective;

public interface StateTransitionBasedIObjective {
	/**
     * Returns the name of the objective.
     * 
     * @return The name of the objective.
     */
    String getName();

    /**
     * Sets the {@link Comparator} which is used to compare fitness (doubles). It determines whether the objective is to
     * minimize or maximize (or minimize or maximize a delta from a given number).
     * 
     * @param comparator The comparator.
     */
    void setComparator(Comparator<Double> comparator);

    /**
     * Returns a {@link Comparator} which is used to compare fitness (doubles). It determines whether the objective is
     * to minimize or maximize (or minimize or maximize a delta from a given number).
     * 
     * @return The comparator.
     */
    Comparator<Double> getComparator();

    /**
     * Calculates the value of the objective on a given solution (trajectory).
     * 
     * @param context
     *            The {@link ThreadContext}
     * @return The objective value in double.
     */
    Double getFitness(StateTransitionBasedThreadContext context);

    /**
     * Initializes the objective. It is called exactly once for every thread starts.
     * 
     * @param context
     *            The {@link ThreadContext}.
     */
    void init(StateTransitionBasedThreadContext context);

    /**
     * Returns an instance of the {@link IObjective}. If it returns the same instance, all the methods has to be thread
     * save as they are called concurrently.
     * 
     * @return An instance of the objective.
     */
    StateTransitionBasedIObjective createNew();

    /**
     * Returns true if the objective is a hard objective. In such a case the method
     * {@link IObjective#satisifiesHardObjective(Double)} is called.
     * 
     * @return True if the objective is a hard objective.
     * @see IObjective#satisifiesHardObjective(Double)
     * @see IObjective
     */
    boolean isHardObjective();

    /**
     * Determines if the given fitness value satisfies the hard objective.
     * 
     * @param fitness
     *            The fitness value of a solution.
     * @return True if it satisfies the hard objective or it is a soft constraint.
     * @see IObjective
     */
    boolean satisifiesHardObjective(Double fitness);

    /**
     * Set the level of the objective.
     */
    void setLevel(int level);

    /**
     * Gets the level of the objective.
     */
    int getLevel();
}
