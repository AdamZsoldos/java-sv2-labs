package inheritanceattributes.building;

public class SchoolBuilding extends Building {

    private final int numClassRooms;

    public SchoolBuilding(String name, double area, int numFloors, int numClassRooms) {
        super(name, area, numFloors);
        this.numClassRooms = numClassRooms;
    }

    public int getNumClassRooms() {
        return numClassRooms;
    }
}
