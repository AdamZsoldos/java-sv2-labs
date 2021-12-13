package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    FerryBoat ferryBoat = new FerryBoat(3000);
    Car car1 = new Car(900, 3);
    Car car2 = new Car(900, 4);
    Van van1 = new Van(900, 1, 150);
    Van van2 = new Van(900, 1, 151);

    @Test
    void testCreate() {
        assertEquals(3000, ferryBoat.getVehicleWeight());
        assertEquals(3075, ferryBoat.getGrossLoad());
        assertNull(ferryBoat.getCar());
    }

    @Test
    void testGetGrossLoad() {
        ferryBoat.load(car1);
        assertEquals(4275, ferryBoat.getGrossLoad());
        ferryBoat.load(van1);
        assertEquals(4275, ferryBoat.getGrossLoad());
    }

    @Test
    void testCanCarry() {
        assertTrue(ferryBoat.canCarry(car1));
        assertFalse(ferryBoat.canCarry(car2));
        assertTrue(ferryBoat.canCarry(van1));
        assertFalse(ferryBoat.canCarry(van2));
    }

    @Test
    void testLoad() {
        assertFalse(ferryBoat.load(car2));
        assertNull(ferryBoat.getCar());
        assertTrue(ferryBoat.load(car1));
        assertSame(car1, ferryBoat.getCar());
    }

    @Test
    void testTestToString() {
        assertEquals("FerryBoat{car=null}", ferryBoat.toString());
        ferryBoat.load(car1);
        assertEquals("FerryBoat{car=Car{vehicleWeight=900, numberOfPassengers=3}}", ferryBoat.toString());
        ferryBoat.load(van1);
        assertEquals("FerryBoat{car=Van{vehicleWeight=900, numberOfPassengers=1, cargoWeight=150}}", ferryBoat.toString());
    }
}
