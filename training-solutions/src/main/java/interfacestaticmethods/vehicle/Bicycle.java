package interfacestaticmethods.vehicle;

public class Bicycle implements Vehicle {

    private final int numberOfWheels;

    public Bicycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
