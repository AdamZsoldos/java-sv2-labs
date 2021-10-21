package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    private CylinderCalculatorBasedOnCircle() {}

    public static double calculateSurfaceArea(double r, double h) {
        return 2 * CircleCalculator.calculateArea(r) + CircleCalculator.calculateCircumference(r) * h;
    }

    public static double calculateVolume(double r, double h) {
        return CircleCalculator.calculateArea(r) * h;
    }
}
