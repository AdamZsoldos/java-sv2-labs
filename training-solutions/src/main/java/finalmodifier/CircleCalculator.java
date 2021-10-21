package finalmodifier;

public class CircleCalculator {

    public static final double PI = Math.PI;

    private CircleCalculator() {}

    public static double calculateCircumference(double r) {
        return 2 * r * PI;
    }

    public static double calculateArea(double r) {
        return Math.pow(r, 2) * PI;
    }
}
