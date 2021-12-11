package interfacerules.common;

public class IkeaFurniture implements HasName, HasWidth, HasLength {

    private final String name;
    private final double width;
    private final double length;

    public IkeaFurniture(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }
}
