package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Victory", 1990, 21.4);
    }

    @Test
    void testName() {
        assertEquals("Victory", ship.getName());
        assertNotEquals("", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1990, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1990);
        assertFalse(ship.getYearOfConstruction() != 1990);
    }

    @Test
    void testLength() {
        assertEquals(21.0, ship.getLength(), 0.5);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;
        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;
        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Victory", 1990, 21.4);;
        assertNotSame(ship, anotherShip);
    }
}
