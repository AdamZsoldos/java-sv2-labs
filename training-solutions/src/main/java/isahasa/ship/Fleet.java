package isahasa.ship;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private final List<Ship> ships = new ArrayList<>();
    private int excessCargoWeight;
    private int excessPassengers;

    public List<Ship> getShips() {
        return ships;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public int getExcessCargoWeight() {
        return excessCargoWeight;
    }

    public int getExcessPassengers() {
        return excessPassengers;
    }

    public void loadShips(int cargoWeight, int passengers) {
        for (Ship ship : ships) {
            if (ship instanceof CanCarryGoods) {
                cargoWeight = ((CanCarryGoods) ship).loadCargo(cargoWeight);
            }
            if (ship instanceof CanCarryPassengers) {
                passengers = ((CanCarryPassengers) ship).loadPassengers(passengers);
            }
        }
        excessCargoWeight += cargoWeight;
        excessPassengers += passengers;
    }
}
