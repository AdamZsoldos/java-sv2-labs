package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C3POTest {

    C3PO c3PO = new C3PO(new Point(4, 6, 0));

    @Test
    void testCreate() {
        assertEquals(4, c3PO.getPosition().getX());
        assertEquals(6, c3PO.getPosition().getY());
        assertEquals(0, c3PO.getPosition().getZ());
        assertEquals(0, c3PO.getAngle());
        assertEquals(1, c3PO.getPath().size());
        assertEquals(4, c3PO.getPath().get(0).getX());
        assertEquals(6, c3PO.getPath().get(0).getY());
        assertEquals(0, c3PO.getPath().get(0).getZ());
    }

    @Test
    void testMoveTo() {
        c3PO.moveTo(new Point(7, 9, 0));
        assertEquals(2, c3PO.getPath().size());
        assertEquals(7, c3PO.getPath().get(1).getX());
        assertEquals(9, c3PO.getPath().get(1).getY());
        assertEquals(0, c3PO.getPath().get(1).getZ());
    }

    @Test
    void testFastMoveTo() {
        c3PO.fastMoveTo(new Point(7, 9, 0));
        assertEquals(2, c3PO.getPath().size());
        assertEquals(7, c3PO.getPath().get(1).getX());
        assertEquals(9, c3PO.getPath().get(1).getY());
        assertEquals(0, c3PO.getPath().get(1).getZ());
    }

    @Test
    void testRotate() {
        c3PO.rotate(20);
        assertEquals(20, c3PO.getAngle());
    }
}
