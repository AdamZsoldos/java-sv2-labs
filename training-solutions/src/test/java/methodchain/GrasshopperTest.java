package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();

    @Test
    void testHopOnce() {
        grasshopper.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE);
        assertEquals(1, grasshopper.getPosition());
        grasshopper.hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE);
        assertEquals(-2, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        for (int i = 1; i <= 5; i++) {
            grasshopper.moveFromZeroToThreeWithFiveHops(i);
            assertEquals(3, grasshopper.getPosition());
            grasshopper = new Grasshopper();
        }

    }

    @Test
    void testMoveFromZeroToThreeWithFiveHopsTooLow() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> grasshopper.moveFromZeroToThreeWithFiveHops(0));
        assertEquals("Param must be between 1 and 5!", e.getMessage());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHopsTooHigh() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> grasshopper.moveFromZeroToThreeWithFiveHops(6));
        assertEquals("Param must be between 1 and 5!", e.getMessage());
    }
}
