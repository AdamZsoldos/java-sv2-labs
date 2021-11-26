package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    @Test
    void testDistanceTo() {
        Trooper trooper = new Trooper("John Doe");
        assertEquals(0, trooper.distanceTo(new Position(0, 0)), 0.05);
        assertEquals(5, trooper.distanceTo(new Position(4, 3)), 0.05);
        trooper.setPosition(new Position(2, 2));
        assertEquals(Math.sqrt(5), trooper.distanceTo(new Position(4, 3)), 0.05);
    }
}
