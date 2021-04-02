package event.driven.scenario.dse.source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.TrajectoryFitness;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;

public class StateTransitionBasedObjectiveComparatorHelper {
	 private StateTransitionBasedIObjective[][] leveledObjectives;
	    private List<TrajectoryFitness> trajectoryFitnesses = new ArrayList<TrajectoryFitness>();
	    private Random random = new Random();
	    private boolean computeCrowdingDistance = false;

	    public StateTransitionBasedObjectiveComparatorHelper(StateTransitionBasedIObjective[][] leveledObjectives) {
	        this.leveledObjectives = leveledObjectives;
	    }

	    public void setComputeCrowdingDistance(boolean computeCrowdingDistance) {
	        this.computeCrowdingDistance = computeCrowdingDistance;
	    }

	    /**
	     * Compares two fitnesses based on hierarchical dominance. Returns -1 if the second parameter {@code o2} is a better
	     * solution ({@code o2} dominates {@code o1}), 1 if the first parameter {@code o1} is better ({@code o1} dominates
	     * {@code o2}) and returns 0 if they are non-dominating each other.
	     */
	    public int compare(Fitness o1, Fitness o2) {

	        levelsLoop: for (int i = 0; i < leveledObjectives.length; i++) {

	            boolean o1HasBetterFitness = false;
	            boolean o2HasBetterFitness = false;

	            for (StateTransitionBasedIObjective objective : leveledObjectives[i]) {
	                String objectiveName = objective.getName();
	                int sgn = objective.getComparator().compare(o1.get(objectiveName), o2.get(objectiveName));

	                if (sgn < 0) {
	                    o2HasBetterFitness = true;
	                }
	                if (sgn > 0) {
	                    o1HasBetterFitness = true;
	                }
	                if (o1HasBetterFitness && o2HasBetterFitness) {
	                    continue levelsLoop;
	                }
	            }
	            if (o2HasBetterFitness && !o1HasBetterFitness) {
	                return -1;
	            } else if (!o2HasBetterFitness && o1HasBetterFitness) {
	                return 1;
	            }
	        }

	        return 0;

	    }

	    /**
	     * Adds a {@link TrajectoryFitness} to an inner list to compare later.
	     * 
	     * @param trajectoryFitness
	     */
	    public void addTrajectoryFitness(TrajectoryFitness trajectoryFitness) {
	        trajectoryFitnesses.add(trajectoryFitness);
	    }

	    /**
	     * Clears the inner {@link TrajectoryFitness} list.
	     */
	    public void clearTrajectoryFitnesses() {
	        trajectoryFitnesses.clear();
	    }

	    /**
	     * Returns the inner {@link TrajectoryFitness} list.
	     */
	    public List<TrajectoryFitness> getTrajectoryFitnesses() {
	        return trajectoryFitnesses;
	    }

	    /**
	     * Returns a random {@link TrajectoryFitness} from the pareto front.
	     */
	    public TrajectoryFitness getRandomBest() {
	        List<TrajectoryFitness> paretoFront = getParetoFront();
	        int randomIndex = random.nextInt(paretoFront.size());
	        return paretoFront.get(randomIndex);
	    }

	    /**
	     * Returns the pareto front of the previously added {@link TrajectoryFitness}.
	     */
	    public List<TrajectoryFitness> getParetoFront() {
	        return getFronts().get(0);
	    }

	    /**
	     * Returns the previously added {@link TrajectoryFitness} instances in fronts.
	     */
	    public List<? extends List<TrajectoryFitness>> getFronts() {
	        Preconditions.checkArgument(!trajectoryFitnesses.isEmpty(), "No trajectory fitnesses were added.");
	        List<ArrayList<TrajectoryFitness>> fronts = new ArrayList<ArrayList<TrajectoryFitness>>();

	        Map<TrajectoryFitness, ArrayList<TrajectoryFitness>> dominatedInstances = new HashMap<TrajectoryFitness, ArrayList<TrajectoryFitness>>();
	        Map<TrajectoryFitness, Integer> dominatingInstances = new HashMap<TrajectoryFitness, Integer>();

	        // calculate dominations
	        for (TrajectoryFitness TrajectoryFitnessP : trajectoryFitnesses) {
	            dominatedInstances.put(TrajectoryFitnessP, new ArrayList<TrajectoryFitness>());
	            dominatingInstances.put(TrajectoryFitnessP, 0);

	            for (TrajectoryFitness TrajectoryFitnessQ : trajectoryFitnesses) {
	                int dominates = compare(TrajectoryFitnessP.fitness, TrajectoryFitnessQ.fitness);
	                if (dominates > 0) {
	                    dominatedInstances.get(TrajectoryFitnessP).add(TrajectoryFitnessQ);
	                } else if (dominates < 0) {
	                    dominatingInstances.put(TrajectoryFitnessP, dominatingInstances.get(TrajectoryFitnessP) + 1);
	                }
	            }

	            if (dominatingInstances.get(TrajectoryFitnessP) == 0) {
	                // p belongs to the first front
	                TrajectoryFitnessP.rank = 1;
	                if (fronts.isEmpty()) {
	                    ArrayList<TrajectoryFitness> firstDominationFront = new ArrayList<TrajectoryFitness>();
	                    firstDominationFront.add(TrajectoryFitnessP);
	                    fronts.add(firstDominationFront);
	                } else {
	                    List<TrajectoryFitness> firstDominationFront = fronts.get(0);
	                    firstDominationFront.add(TrajectoryFitnessP);
	                }
	            }
	        }

	        // create fronts
	        int i = 1;
	        while (fronts.size() == i) {
	            ArrayList<TrajectoryFitness> nextDominationFront = new ArrayList<TrajectoryFitness>();
	            for (TrajectoryFitness TrajectoryFitnessP : fronts.get(i - 1)) {
	                for (TrajectoryFitness TrajectoryFitnessQ : dominatedInstances.get(TrajectoryFitnessP)) {
	                    dominatingInstances.put(TrajectoryFitnessQ, dominatingInstances.get(TrajectoryFitnessQ) - 1);
	                    if (dominatingInstances.get(TrajectoryFitnessQ) == 0) {
	                        TrajectoryFitnessQ.rank = i + 1;
	                        nextDominationFront.add(TrajectoryFitnessQ);
	                    }
	                }
	            }
	            i++;
	            if (!nextDominationFront.isEmpty()) {
	                if (computeCrowdingDistance) {
	                    crowdingDistanceAssignment(nextDominationFront, leveledObjectives);
	                }
	                fronts.add(nextDominationFront);
	            }
	        }

	        return fronts;
	    }

	    /**
	     * Executes the crowding distance assignment for the specified front.
	     * 
	     * @param front
	     */
	    public static void crowdingDistanceAssignment(List<TrajectoryFitness> front, StateTransitionBasedIObjective[][] leveledObjectives) {

	        for (TrajectoryFitness InstanceData : front) {
	            // initialize crowding distance
	            InstanceData.crowdingDistance = 0;
	        }

	        for (final StateTransitionBasedIObjective[] objectives : leveledObjectives) {
	            for (final StateTransitionBasedIObjective objective : objectives) {

	                final String m = objective.getName();
	                TrajectoryFitness[] sortedFront = front.toArray(new TrajectoryFitness[0]);
	                // sort using m-th objective value
	                Arrays.sort(sortedFront, (o1, o2) -> objective.getComparator().compare(o1.fitness.get(m), o2.fitness.get(m)));
	                // so that boundary points are always selected
	                sortedFront[0].crowdingDistance = Double.POSITIVE_INFINITY;
	                sortedFront[sortedFront.length - 1].crowdingDistance = Double.POSITIVE_INFINITY;
	                // If minimal and maximal fitness value for this objective are
	                // equal, then do not change crowding distance
	                if (sortedFront[0].fitness.get(m) != sortedFront[sortedFront.length - 1].fitness.get(m)) {
	                    for (int i = 1; i < sortedFront.length - 1; i++) {
	                        double newCrowdingDistance = sortedFront[i].crowdingDistance;
	                        newCrowdingDistance += (sortedFront[i + 1].fitness.get(m) - sortedFront[i - 1].fitness.get(m))
	                                / (sortedFront[sortedFront.length - 1].fitness.get(m) - sortedFront[0].fitness.get(m));

	                        sortedFront[i].crowdingDistance = newCrowdingDistance;
	                    }
	                }
	            }
	        }
	    }
}
