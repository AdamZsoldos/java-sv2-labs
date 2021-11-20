package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angle) {
        angle += this.angle;
        if (angle < -80 || angle > 80) {
            throw new IllegalArgumentException("Angle " + angle + " out of bounds! Must be between of -80..80.");
        }
        this.angle = angle;
    }
}
