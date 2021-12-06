package inheritancemethods.car;

public class Jeep extends Car {

    private final double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public double getTotalFuel() {
        return super.getTotalFuel() + extraFuel;
    }

    @Override
    public void setTotalFuel(double fuel) {
        if (fuel > getTankCapacity()) {
            super.setTotalFuel(getTankCapacity());
            extraFuel = fuel - getTankCapacity();
        } else {
            super.setTotalFuel(fuel);
            extraFuel = 0;
        }
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }
}
