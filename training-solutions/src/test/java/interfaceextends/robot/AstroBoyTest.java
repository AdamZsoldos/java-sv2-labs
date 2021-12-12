package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroBoyTest {

    AstroBoy astroBoy = new AstroBoy(new Point(4, 6, 0));

    @Test
    void testCreate() {
        assertEquals(4, astroBoy.getPosition().getX());
        assertEquals(6, astroBoy.getPosition().getY());
        assertEquals(0, astroBoy.getPosition().getZ());
        assertEquals(0, astroBoy.getAngle());
        assertEquals(1, astroBoy.getPath().size());
        assertEquals(4, astroBoy.getPath().get(0).getX());
        assertEquals(6, astroBoy.getPath().get(0).getY());
        assertEquals(0, astroBoy.getPath().get(0).getZ());
    }

    @Test
    void testWalkTo() {
        astroBoy.walkTo(new Point(7, 9, 0));
        assertEquals(2, astroBoy.getPath().size());
        assertEquals(7, astroBoy.getPath().get(1).getX());
        assertEquals(9, astroBoy.getPath().get(1).getY());
        assertEquals(0, astroBoy.getPath().get(1).getZ());
    }

    @Test
    void testFlyTo() {
        astroBoy.flyTo(new Point(7, 9, 0));
        assertEquals(4, astroBoy.getPath().size());
        assertEquals(4, astroBoy.getPath().get(1).getX());
        assertEquals(6, astroBoy.getPath().get(1).getY());
        assertEquals(5, astroBoy.getPath().get(1).getZ());
        assertEquals(7, astroBoy.getPath().get(2).getX());
        assertEquals(9, astroBoy.getPath().get(2).getY());
        assertEquals(5, astroBoy.getPath().get(2).getZ());
        assertEquals(7, astroBoy.getPath().get(3).getX());
        assertEquals(9, astroBoy.getPath().get(3).getY());
        assertEquals(0, astroBoy.getPath().get(3).getZ());
    }

    @Test
    void testLiftTo() {
        astroBoy.liftTo(15);
        assertEquals(2, astroBoy.getPath().size());
        assertEquals(4, astroBoy.getPath().get(1).getX());
        assertEquals(6, astroBoy.getPath().get(1).getY());
        assertEquals(15, astroBoy.getPath().get(1).getZ());
    }

    @Test
    void testRotate() {
        astroBoy.rotate(20);
        assertEquals(20, astroBoy.getAngle());
    }
}
