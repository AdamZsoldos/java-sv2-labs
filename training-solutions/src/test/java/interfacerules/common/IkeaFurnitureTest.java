package interfacerules.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IkeaFurnitureTest {

    @Test
    void testCreate() {
        IkeaFurniture furniture = new IkeaFurniture("MALM", 180, 200);
        assertEquals("MALM", furniture.getName());
        assertEquals(180, furniture.getWidth());
        assertEquals(200, furniture.getLength());
    }
}
