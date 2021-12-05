package inheritanceattributes.building;

public class Building {

    protected final String name;
    protected final double area;
    private final int numFloors;

    public Building(String name, double area, int numFloors) {
        this.name = name;
        this.area = area;
        this.numFloors = numFloors;
    }

    public int getNumFloors() {
        return numFloors;
    }
}
