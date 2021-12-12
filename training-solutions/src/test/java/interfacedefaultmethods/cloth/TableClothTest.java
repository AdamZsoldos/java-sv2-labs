package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    TableCloth tableCloth = new TableCloth(10);

    @Test
    void testGetSideLength() {
        assertEquals(10, tableCloth.getSideLength());
    }

    @Test
    void testGetNumberOfSides() {
        assertEquals(4, tableCloth.getNumberOfSides());
    }

    @Test
    void testGetLengthOfDiagonal() {
        assertEquals(14.1421, tableCloth.getLengthOfDiagonal(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        assertEquals(40, tableCloth.getPerimeter());
    }

    @Test
    void testGetArea() {
        assertEquals(100, tableCloth.getArea());
    }
}
