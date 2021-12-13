package isahasa.ship;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private final int maxPassengers;

    protected CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassengers(int passengers) {
        this.passengers += passengers;
        int excessPassengers = Math.max(this.passengers - maxPassengers, 0);
        if (excessPassengers > 0) { this.passengers = maxPassengers; }
        return excessPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
