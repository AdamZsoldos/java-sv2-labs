package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(12, 8);

    @Test
    void testCreate() {
        assertEquals(12, rectangle.getSideA());
        assertEquals(8, rectangle.getSideB());
    }

    @Test
    void testGetArea() {
        assertEquals(96, rectangle.getArea());
    }
}
