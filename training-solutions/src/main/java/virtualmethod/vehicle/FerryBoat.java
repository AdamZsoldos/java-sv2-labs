package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {

    private static final int MAX_CARRY_WEIGHT = 1200;
    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    public Car getCar() {
        return car;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + (car != null ? car.getGrossLoad() : 0);
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() <= MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
