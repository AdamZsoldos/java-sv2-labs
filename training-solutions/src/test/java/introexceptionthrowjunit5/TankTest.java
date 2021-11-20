package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    void testModifyAngle() {
        assertEquals(0, tank.getAngle());
        tank.modifyAngle(80);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(-160);
        assertEquals(-80, tank.getAngle());
    }

    @Test
    void testModifyAngleTooLow() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(-81));
        assertEquals("Angle -81 out of bounds! Must be between of -80..80.", e.getMessage());
    }

    @Test
    void testModifyTooHigh() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(81));
        assertEquals("Angle 81 out of bounds! Must be between of -80..80.", e.getMessage());
    }
}
