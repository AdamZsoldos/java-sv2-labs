package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Hydra", 6, 12.5);
        assertEquals("Hydra", dragon.getName());
        assertNotEquals("Dragon", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Hydra", 6, 12.5);
        assertEquals(6, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 6);
        assertFalse(dragon.getNumberOfHeads() == 7);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Hydra", 6, 12.5);
        assertEquals(12.0, dragon.getHeight(), 0.5);
    }

    @Test
    void testNull() {
        Dragon dragon1 = new Dragon("Hydra", 6, 12.5);
        Dragon dragon2 = null;
        assertNotNull(dragon1);
        assertNull(dragon2);
    }

    @Test
    void testSameObject() {
        Dragon dragon1 = new Dragon("Hydra", 6, 12.5);
        Dragon dragon2 = dragon1;
        assertSame(dragon1, dragon2);
    }

    @Test
    void testNotSameObject() {
        Dragon dragon1 = new Dragon("Hydra", 6, 12.5);
        Dragon dragon2 = new Dragon("Hydra", 6, 12.5);
        assertNotSame(dragon1, dragon2);
    }
}
