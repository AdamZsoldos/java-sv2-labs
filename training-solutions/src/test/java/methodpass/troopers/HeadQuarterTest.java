package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    HeadQuarter hq = new HeadQuarter();

    @BeforeEach
    void setUp() {
        hq.addTrooper(new Trooper("John"));
        hq.addTrooper(new Trooper("Jane"));
        hq.addTrooper(new Trooper("Jill"));
        hq.getTroopers().get(1).setPosition(new Position(4, 5));
        hq.getTroopers().get(2).setPosition(new Position(-3, -6));
    }

    @Test
    void testAddTrooper() {
        assertEquals(3, hq.getTroopers().size());
    }

    @Test
    void testAddTrooperWithNull() {
        assertEquals(3, hq.getTroopers().size());
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> hq.addTrooper(null));
        assertEquals("Trooper cannot be null!", e.getMessage());
        assertEquals(3, hq.getTroopers().size());
    }

    @Test
    void testMoveClosestTrooper() {
        hq.moveClosestTrooper(new Position(8, 8));
        assertEquals(0, hq.getTroopers().get(0).getPosition().getA());
        assertEquals(0, hq.getTroopers().get(0).getPosition().getB());
        assertEquals(8, hq.getTroopers().get(1).getPosition().getA());
        assertEquals(8, hq.getTroopers().get(1).getPosition().getB());
        assertEquals(-3, hq.getTroopers().get(2).getPosition().getA());
        assertEquals(-6, hq.getTroopers().get(2).getPosition().getB());
    }

    @Test
    void testMoveTrooperByName() {
        hq.moveTrooperByName("Jill", new Position(8, 8));
        assertEquals(0, hq.getTroopers().get(0).getPosition().getA());
        assertEquals(0, hq.getTroopers().get(0).getPosition().getB());
        assertEquals(4, hq.getTroopers().get(1).getPosition().getA());
        assertEquals(5, hq.getTroopers().get(1).getPosition().getB());
        assertEquals(8, hq.getTroopers().get(2).getPosition().getA());
        assertEquals(8, hq.getTroopers().get(2).getPosition().getB());
    }
}
