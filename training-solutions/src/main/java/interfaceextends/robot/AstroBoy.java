package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private static final long ALTITUDE = 5;
    private Point position;
    private int angle;
    private final List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
        path.add(position);
    }

    public Point getPosition() {
        return position;
    }

    public void walkTo(Point position) {
        moveTo(position);
    }

    public void flyTo(Point position) {
        fastMoveTo(position);
    }

    @Override
    public void moveTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        moveTo(new Point(position.getX(), position.getY(), ALTITUDE));
        moveTo(position);
    }

    @Override
    public void liftTo(long altitude) {
        moveTo(new Point(position.getX(), position.getY(), altitude));
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
