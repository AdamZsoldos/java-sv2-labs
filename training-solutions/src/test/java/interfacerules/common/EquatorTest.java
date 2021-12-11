package interfacerules.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquatorTest {

    @Test
    void testCreate() {
        Equator eq = new Equator();
        assertEquals("Equator", eq.getName());
        assertEquals(40_075.017, eq.getLength(), 0.001);
    }
}
