package finalmodifier;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius:");
        double r = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter height:");
        double h = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Radius: " + r);
        System.out.println("Height: " + h);

        System.out.println("Circle circumference: " + CircleCalculator.calculateCircumference(r));
        System.out.println("Circle area: " + CircleCalculator.calculateArea(r));

        System.out.println("Cylinder surface area: " + CylinderCalculator.calculateSurfaceArea(r, h));
        System.out.println("Cylinder volume: " + CylinderCalculator.calculateVolume(r, h));

        System.out.println("Cylinder surface area (based on circle): " + CylinderCalculatorBasedOnCircle.calculateSurfaceArea(r, h));
        System.out.println("Cylinder volume (based on circle): " + CylinderCalculatorBasedOnCircle.calculateVolume(r, h));
    }
}
