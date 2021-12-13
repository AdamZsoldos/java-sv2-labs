package isahasa.ship;

public class Liner implements Ship, CanCarryPassengers {

    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers) {
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadPassengers(int passengers) {
        return canCarryPassengers.loadPassengers(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
