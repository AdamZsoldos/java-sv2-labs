package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("office", 500, 2);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getNumFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("school", 400, 1, 10);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getNumFloors());
        System.out.println(schoolBuilding.getNumClassRooms());
    }
}
