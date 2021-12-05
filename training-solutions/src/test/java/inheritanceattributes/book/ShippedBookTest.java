package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    ShippedBook shippedBook = new ShippedBook("Uzumaki", 3000, 1000);

    @Test
    void testGetTotalCost() {
        assertEquals(4000, shippedBook.getTotalCost(1));
        assertEquals(7000, shippedBook.getTotalCost(2));
    }

    @Test
    void testTestToString() {
        assertEquals("Uzumaki: 3000 Ft, postaköltség: 1000 Ft", shippedBook.toString());
    }
}
