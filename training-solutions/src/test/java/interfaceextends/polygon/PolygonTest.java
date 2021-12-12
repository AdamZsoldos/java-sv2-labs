package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    Polygon triangle = new Polygon(3, 10);
    Polygon square = new Polygon(4, 10);
    Polygon pentagon = new Polygon(5, 10);
    Polygon hexagon = new Polygon(6, 10);

    @Test
    void testCreate() {
        assertEquals(3, triangle.getNumberOfVertices());
        assertEquals(10, triangle.getLengthOfSide());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(30, triangle.getPerimeter());
        assertEquals(40, square.getPerimeter());
        assertEquals(50, pentagon.getPerimeter());
        assertEquals(60, hexagon.getPerimeter());
    }

    @Test
    void testGetNumberOfDiagonalsFromOneVertex() {
        assertEquals(0, triangle.getNumberOfDiagonalsFromOneVertex());
        assertEquals(1, square.getNumberOfDiagonalsFromOneVertex());
        assertEquals(2, pentagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(3, hexagon.getNumberOfDiagonalsFromOneVertex());
    }

    @Test
    void testGetNumberOfAllDiagonals() {
        assertEquals(0, triangle.getNumberOfAllDiagonals());
        assertEquals(2, square.getNumberOfAllDiagonals());
        assertEquals(5, pentagon.getNumberOfAllDiagonals());
        assertEquals(9, hexagon.getNumberOfAllDiagonals());
    }
}
