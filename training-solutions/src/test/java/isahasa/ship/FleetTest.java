package isahasa.ship;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {

    Fleet fleet;

    @BeforeEach
    void setUp() {
        fleet = new Fleet();
        fleet.addShip(new CargoShip(500));
        fleet.addShip(new Liner(50));
        fleet.addShip(new FerryBoat(500, 50));
    }

    @Test
    void testCreate() {
        assertEquals(3, fleet.getShips().size());
        assertEquals(0, fleet.getExcessCargoWeight());
        assertEquals(0, fleet.getExcessPassengers());
    }

    @Test
    void testLoadShip() {
        fleet.loadShips(500, 50);
        assertEquals(0, fleet.getExcessCargoWeight());
        assertEquals(0, fleet.getExcessPassengers());
        fleet.loadShips(500, 50);
        assertEquals(0, fleet.getExcessCargoWeight());
        assertEquals(0, fleet.getExcessPassengers());
        fleet.loadShips(500, 50);
        assertEquals(500, fleet.getExcessCargoWeight());
        assertEquals(50, fleet.getExcessPassengers());
        fleet.loadShips(500, 50);
        assertEquals(1000, fleet.getExcessCargoWeight());
        assertEquals(100, fleet.getExcessPassengers());
    }
}
