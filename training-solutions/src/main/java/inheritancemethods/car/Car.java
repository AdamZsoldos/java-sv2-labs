package inheritancemethods.car;

public class Car {

    private final double fuelRate;
    private double fuel;
    private final double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTotalFuel() {
        return getFuel();
    }

    public void setTotalFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        setTotalFuel(getTotalFuel() + fuel);
    }

    public void drive(int km) {
        double fuelCost = calculateFuelCost(km);
        validateDrive(fuelCost);
        modifyFuelAmount(-fuelCost);
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    private double calculateFuelCost(int km) {
        return fuelRate * km / 100;
    }

    private void validateDrive(double fuelCost) {
        if (getTotalFuel() < fuelCost) {
            throw new IllegalArgumentException("Not enough fuel.");
        }
    }
}
