package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((double) x - point.x, 2) + Math.pow((double) y - point.y, 2));
    }
}
