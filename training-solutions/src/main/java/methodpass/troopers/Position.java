package methodpass.troopers;

public class Position {

    private final double a;
    private final double b;

    public Position(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double distanceTo(Position position) {
        return Math.sqrt(Math.pow(a - position.a, 2) + Math.pow(b - position.b, 2));
    }
}
