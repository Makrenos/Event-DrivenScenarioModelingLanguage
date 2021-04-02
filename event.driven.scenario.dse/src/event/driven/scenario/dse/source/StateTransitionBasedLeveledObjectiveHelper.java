package event.driven.scenario.dse.source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class StateTransitionBasedLeveledObjectiveHelper {
	private List<StateTransitionBasedIObjective> objectives = new ArrayList<StateTransitionBasedIObjective>();
    private StateTransitionBasedIObjective[][] leveledObjectives;

    public StateTransitionBasedLeveledObjectiveHelper(List<StateTransitionBasedIObjective> objectives) {
        this.objectives = objectives;
    }

    public StateTransitionBasedIObjective[][] initLeveledObjectives() {
        if (objectives.isEmpty()) {
            leveledObjectives = new StateTransitionBasedIObjective[0][0];
            return leveledObjectives;
        }

        int level = objectives.get(0).getLevel();
        boolean oneLevelOnly = true;
        for (StateTransitionBasedIObjective objective : objectives) {
            if (objective.getLevel() != level) {
                oneLevelOnly = false;
                break;
            }
        }

        if (oneLevelOnly) {
            leveledObjectives = new StateTransitionBasedIObjective[1][objectives.size()];
            for (int i = 0; i < objectives.size(); i++) {
                leveledObjectives[0][i] = objectives.get(i);
            }
            return leveledObjectives;
        }

        StateTransitionBasedIObjective[] objectivesArray = getSortedByLevelObjectives(objectives);

        int numberOfLevels = getNumberOfObjectiveLevels(objectivesArray);

        leveledObjectives = new StateTransitionBasedIObjective[numberOfLevels][];

        fillLeveledObjectives(objectivesArray);

        return leveledObjectives;
    }

    private void fillLeveledObjectives(StateTransitionBasedIObjective[] objectivesArray) {
        int actLevel = objectivesArray[0].getLevel();
        int levelIndex = 0;
        int lastIndex = 0;
        int corrigationForLastLevel = 0;
        boolean oneObjectiveAtLastLevel = false;
        for (int i = 0; i < objectivesArray.length; i++) {
            if (i == objectivesArray.length - 1) {
                corrigationForLastLevel = 1;
                if (objectivesArray[i - 1].getLevel() != objectivesArray[i].getLevel()) {
                    oneObjectiveAtLastLevel = true;
                    corrigationForLastLevel = 0;
                }
            }
            if (objectivesArray[i].getLevel() != actLevel || corrigationForLastLevel == 1 || oneObjectiveAtLastLevel) {
                leveledObjectives[levelIndex] = new StateTransitionBasedIObjective[i - lastIndex + corrigationForLastLevel];
                for (int j = lastIndex; j < i + corrigationForLastLevel; j++) {
                    leveledObjectives[levelIndex][j - lastIndex] = objectivesArray[j];
                }
                if (oneObjectiveAtLastLevel) {
                    leveledObjectives[levelIndex + 1] = new StateTransitionBasedIObjective[1];
                    leveledObjectives[levelIndex + 1][0] = objectivesArray[i];
                }
                actLevel = objectivesArray[i].getLevel();
                levelIndex++;
                lastIndex = i;
            }
        }
    }

    private int getNumberOfObjectiveLevels(StateTransitionBasedIObjective[] objectivesArray) {

        int actLevel = objectivesArray[0].getLevel();
        int numberOfLevels = 1;

        for (int i = 1; i < objectivesArray.length; i++) {
            if (objectivesArray[i].getLevel() != actLevel) {
                numberOfLevels++;
                actLevel = objectivesArray[i].getLevel();
            }
        }

        return numberOfLevels;
    }

    private StateTransitionBasedIObjective[] getSortedByLevelObjectives(List<StateTransitionBasedIObjective> objectives) {
        StateTransitionBasedIObjective[] objectivesArray = objectives.toArray(new StateTransitionBasedIObjective[objectives.size()]);
        Arrays.sort(objectivesArray, Comparator.comparingInt(StateTransitionBasedIObjective::getLevel)); 
        return objectivesArray;
    }

    public StateTransitionBasedIObjective[][] getLeveledObjectives() {
        return leveledObjectives;
    }
}
