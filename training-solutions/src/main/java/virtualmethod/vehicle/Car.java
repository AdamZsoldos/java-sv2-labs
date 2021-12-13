package virtualmethod.vehicle;

public class Car extends Vehicle {

    private final int numberOfPassengers;

    public Car(int vehicleWeight, int numberOfPassengers) {
        super(vehicleWeight);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + numberOfPassengers * PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleWeight=" + getVehicleWeight() + ", " +
                "numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
