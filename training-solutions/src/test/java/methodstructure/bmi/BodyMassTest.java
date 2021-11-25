package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    BodyMass bm1 = new BodyMass(80.0, 1.8);
    BodyMass bm2 = new BodyMass(100.0, 1.8);
    BodyMass bm3 = new BodyMass(50.0, 1.8);

    @Test
    void testGetBodyMassIndex() {
        assertEquals(24.6913, bm1.getBodyMassIndex(), 0.05);
        assertEquals(30.8642, bm2.getBodyMassIndex(), 0.05);
        assertEquals(15.4321, bm3.getBodyMassIndex(), 0.05);
    }

    @Test
    void testGetBody() {
        assertEquals(BmiCategory.NORMAL, bm1.getBody());
        assertEquals(BmiCategory.OVERWEIGHT, bm2.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bm3.getBody());
    }

    @Test
    void testIsThinnerThan() {
        assertTrue(bm1.isThinnerThan(bm2));
        assertTrue(bm3.isThinnerThan(bm1));
        assertFalse(bm1.isThinnerThan(bm1));
        assertFalse(bm1.isThinnerThan(bm3));
        assertFalse(bm2.isThinnerThan(bm1));
    }
}
