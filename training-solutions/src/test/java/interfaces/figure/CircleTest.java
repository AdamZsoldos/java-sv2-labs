package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle(12);

    @Test
    void testCreate() {
        assertEquals(12, circle.getRadius());
    }

    @Test
    void testGetArea() {
        assertEquals(452.3893, circle.getArea(), 0.05);
    }
}
