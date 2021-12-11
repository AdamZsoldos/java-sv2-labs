package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle(12, 8);

    @Test
    void testCreate() {
        assertEquals(12, triangle.getBase());
        assertEquals(8, triangle.getHeight());
    }

    @Test
    void testGetArea() {
        assertEquals(48, triangle.getArea());
    }
}
