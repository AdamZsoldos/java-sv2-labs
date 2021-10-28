package numbers;

public class Percent {

    private Percent() {
        throw new IllegalStateException("Utility class");
    }

    public static double getValue(int base, int percentage) {
        return base / 100.0 * percentage;
    }

    public static double getBase(int result, int percentage) {
        return result / (percentage / 100.0);
    }

    public static double getPercentage(int base, int result) {
        return result * 100.0 / base;
    }
}
