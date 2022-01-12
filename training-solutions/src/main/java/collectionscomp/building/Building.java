package collectionscomp.building;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private final String address;
    private final int floorspace;
    private final int numberOfFloors;

    public Building(String address, int floorspace, int numberOfFloors) {
        this.address = address;
        this.floorspace = floorspace;
        this.numberOfFloors = numberOfFloors;
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("10 EW", 100, 10));
        buildings.add(new Building("20 EW", 200, 3));
        buildings.add(new Building("30 EW", 300, 16));
        buildings.add(new Building("40 EW", 600, 5));
        buildings.add(new Building("50 EW", 130, 3));
        for (Building building : buildings) {
            System.out.println(building);
        }
    }

    @Override
    public int compareTo(Building o) {
        return numberOfFloors - o.numberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return numberOfFloors == building.numberOfFloors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFloors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floorspace=" + floorspace +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
