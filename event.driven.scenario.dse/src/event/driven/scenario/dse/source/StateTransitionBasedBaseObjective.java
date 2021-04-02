package event.driven.scenario.dse.source;

import java.util.Comparator;
import java.util.Objects;

import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.impl.BaseObjective;

public class StateTransitionBasedBaseObjective implements StateTransitionBasedIObjective{
	
	protected final String name;
    protected Comparator<Double> comparator = Comparators.HIGHER_IS_BETTER;
    protected int level = 0;

    protected double fitnessConstraint;
    protected boolean isThereFitnessConstraint = false;
    protected Comparator<Double> fitnessConstraintComparator;

    public StateTransitionBasedBaseObjective(String name) {
        Objects.requireNonNull(name, "Name of the objective cannot be null.");
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setComparator(Comparator<Double> comparator) {
        this.comparator = comparator;
    }

    @Override
    public Comparator<Double> getComparator() {
        return comparator;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public StateTransitionBasedBaseObjective withLevel(int level) {
        setLevel(level);
        return this;
    }

    public StateTransitionBasedBaseObjective withComparator(Comparator<Double> comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * Adds a hard constraint on the fitness value. For example, the fitness value must be better than 10 to accept the
     * current state as a solution.
     * 
     * @param fitnessConstraint
     *            Solutions should be better than this value.
     * @param fitnessConstraintComparator
     *            {@link Comparator} to determine if the current state is better than the given value.
     * @return The actual instance to enable builder pattern like usage.
     */
    public StateTransitionBasedBaseObjective withHardConstraintOnFitness(double fitnessConstraint,
            Comparator<Double> fitnessConstraintComparator) {
        this.fitnessConstraint = fitnessConstraint;
        this.fitnessConstraintComparator = fitnessConstraintComparator;
        this.isThereFitnessConstraint = true;
        return this;
    }

    /**
     * Adds a hard constraint on the fitness value. For example, the fitness value must be better than 10 to accept the
     * current state as a solution. The provided comparator will be used.
     * 
     * @param fitnessConstraint
     *            Solutions should be better than this value.
     * @return The actual instance to enable builder pattern like usage.
     */
    public StateTransitionBasedBaseObjective withHardConstraintOnFitness(double fitnessConstraint) {
        return withHardConstraintOnFitness(fitnessConstraint, null);
    }

    @Override
    public void init(StateTransitionBasedThreadContext context) {
        if (fitnessConstraintComparator == null) {
            fitnessConstraintComparator = comparator;
        }   
    }

    @Override
    public boolean isHardObjective() {
        return isThereFitnessConstraint;
    }
    
    @Override
    public boolean satisifiesHardObjective(Double fitness) {
        if (isThereFitnessConstraint) {
            int compare = fitnessConstraintComparator.compare(fitness, fitnessConstraint);
            if (compare < 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseObjective) {
            BaseObjective baseObjective = (BaseObjective) obj;
            return name.equals(baseObjective.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

	@Override
	public Double getFitness(StateTransitionBasedThreadContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StateTransitionBasedIObjective createNew() {
		// TODO Auto-generated method stub
		return null;
	}
}
