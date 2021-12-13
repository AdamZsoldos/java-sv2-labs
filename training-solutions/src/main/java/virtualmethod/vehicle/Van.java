package virtualmethod.vehicle;

public class Van extends Car {

    private final int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassengers, int cargoWeight) {
        super(vehicleWeight, numberOfPassengers);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "vehicleWeight=" + getVehicleWeight() + ", " +
                "numberOfPassengers=" + getNumberOfPassengers() + ", " +
                "cargoWeight=" + cargoWeight +
                '}';
    }
}
