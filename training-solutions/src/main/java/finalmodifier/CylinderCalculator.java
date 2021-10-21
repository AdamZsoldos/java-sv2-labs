package finalmodifier;

public class CylinderCalculator {

    private CylinderCalculator() {}

    public static double calculateSurfaceArea(double r, double h) {
        return 2 * Math.pow(r, 2) * CircleCalculator.PI + 2 * r * CircleCalculator.PI * h;
    }

    public static double calculateVolume(double r, double h) {
        return Math.pow(r, 2) * CircleCalculator.PI * h;
    }
}
