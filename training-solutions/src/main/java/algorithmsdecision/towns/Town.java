package algorithmsdecision.towns;

import java.util.List;

public class Town {

    private Town() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean containsFewerHabitants(List<Integer> populationList, int maxPopulation) {
        for (int population : populationList) {
            if (population <= maxPopulation) return true;
        }
        return false;
    }
}
