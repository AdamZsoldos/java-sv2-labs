package introexceptiontrace.aquarium;

public class Fish {

    private final String type;
    private final String colour;

    public Fish(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
