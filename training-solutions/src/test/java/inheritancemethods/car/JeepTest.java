package inheritancemethods.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    Jeep jeep = new Jeep(10, 100, 100, 50, 50);

    @Test
    void testCreate() {
        assertEquals(10, jeep.getFuelRate());
        assertEquals(100, jeep.getFuel());
        assertEquals(100, jeep.getTankCapacity());
        assertEquals(50, jeep.getExtraCapacity());
        assertEquals(50, jeep.getExtraFuel());
        assertEquals(150, jeep.getTotalFuel());
    }

    @Test
    void testModifyFuelAmount() {
        jeep.modifyFuelAmount(-80);
        assertEquals(70, jeep.getFuel());
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(70, jeep.getTotalFuel());
        jeep.modifyFuelAmount(40);
        assertEquals(100, jeep.getFuel());
        assertEquals(10, jeep.getExtraFuel());
        assertEquals(110, jeep.getTotalFuel());
    }

    @Test
    void testDrive() {
        jeep.drive(1500);
        assertEquals(0, jeep.getTotalFuel());
    }

    @Test
    void testDriveTooLong() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> jeep.drive(1501));
        assertEquals("Not enough fuel.", e.getMessage());
    }

    @Test
    void testCalculateRefillAmount() {
        jeep.modifyFuelAmount(-30);
        assertEquals(30, jeep.calculateRefillAmount());
        jeep.modifyFuelAmount(-50);
        assertEquals(80, jeep.calculateRefillAmount());
    }
}
