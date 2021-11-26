package methodpass.troopers;

public class Trooper {

    private final String name;
    private Position position;

    public Trooper(String name) {
        this.name = name;
        position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double distanceTo(Position position) {
        return this.position.distanceTo(position);
    }
}
