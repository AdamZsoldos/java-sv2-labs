package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testOfBicycle() {
        assertEquals(Bicycle.class, Vehicle.of(2).getClass());
    }

    @Test
    void testOfCar() {
        assertEquals(Car.class, Vehicle.of(4).getClass());
    }

    @Test
    void testOfWrongNumberOfWheels() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(3));
        assertEquals("Number of wheels must be 2 or 4.", e.getMessage());
    }
}
