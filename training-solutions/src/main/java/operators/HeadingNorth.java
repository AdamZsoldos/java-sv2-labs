package operators;

public class HeadingNorth {

    private HeadingNorth() {
        throw new IllegalStateException("Utility class");
    }

    public static int getNumberOfNewDirections() {
        int angle = 0;
        int angleIncrement = 0;
        int totalIncrements = 0;
        while (angle < 360) {
            angleIncrement += 10;
            angle += angleIncrement;
            totalIncrements++;
        }
        return totalIncrements;
    }
}
