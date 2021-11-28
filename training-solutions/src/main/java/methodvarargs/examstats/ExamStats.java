package methodvarargs.examstats;

public class ExamStats {

    private final int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        validateResults(results);
        double pointThreshold = getPointThreshold(limitInPercent);
        int topGrades = 0;
        for (int result : results) {
            if (result >= pointThreshold) topGrades++;
        }
        return topGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        validateResults(results);
        double pointThreshold = getPointThreshold(limitInPercent);
        for (int result : results) {
            if (result < pointThreshold) return true;
        }
        return false;
    }

    private void validateResults(int[] results) {
        if (results.length < 1) {
            throw new IllegalArgumentException("Results array must not be empty!");
        }
    }

    private double getPointThreshold(int percent) {
        return maxPoints * percent * 0.01;
    }
}
