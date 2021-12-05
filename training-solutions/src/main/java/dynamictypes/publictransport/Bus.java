package dynamictypes.publictransport;

public class Bus extends PublicVehicle {

    private final String brand;

    public Bus(int lineNumber, double length, String brand) {
        super(lineNumber, length);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
