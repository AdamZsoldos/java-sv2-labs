package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TankTest {

    @Rule
    public ExpectedException ee = ExpectedException.none();
    private final Tank tank = new Tank();

    @Test
    public void testModifyAngle() {
        assertEquals(0, tank.getAngle());
        tank.modifyAngle(80);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(-160);
        assertEquals(-80, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModifyAngleTooLow() {
        tank.modifyAngle(-81);
    }

    @Test
    public void testModifyTooHigh() {
        ee.expect(IllegalArgumentException.class);
        ee.expectMessage("Angle 81 out of bounds! Must be between of -80..80.");
        tank.modifyAngle(81);
    }

    @Test
    public void testModifyTooHighMultiple() {
        tank.modifyAngle(80);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(1));
        assertEquals("Angle 81 out of bounds! Must be between of -80..80.", e.getMessage());
    }
}
