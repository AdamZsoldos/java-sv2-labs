package isahasa.ship;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {

    private final CanCarryGoods canCarryGoods;
    private final CanCarryPassengers canCarryPassengers;

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
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
