package collectionsautoboxing.paper;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private final Map<String, Integer> paperPerClass = new HashMap<>();

    public Map<String, Integer> getPaperPerClass() {
        return paperPerClass;
    }

    public void putMorePaper(String className, int kilograms) {
        if (paperPerClass.containsKey(className)) {
            paperPerClass.put(className, paperPerClass.get(className) + kilograms);
        } else {
            paperPerClass.put(className, kilograms);
        }
    }

    public String getWinnerClass() {
        String winner = null;
        for (Map.Entry<String, Integer> entry : paperPerClass.entrySet()) {
            if (winner == null || entry.getValue() > paperPerClass.get(winner)) {
                winner = entry.getKey();
            }
        }
        if (winner != null) {
            return winner;
        }
        throw new IllegalStateException("No paper donated yet");
    }

    public int getTotalWeight() {
        int total = 0;
        for (int weight : paperPerClass.values()) {
            total += weight;
        }
        return total;
    }
}
