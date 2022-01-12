package collectionsiterator.xmas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    ChristmasShopping shopping;

    @BeforeEach
    void setUp() {
        shopping = new ChristmasShopping(new ArrayList<>(List.of(
                new ChristmasPresent("Toy", "John", 500),
                new ChristmasPresent("Laptop", "Jill", 500000),
                new ChristmasPresent("Sweater", "Jack", 5000)
        )));
    }

    @Test
    void testCreate() {
        assertEquals(3, shopping.getPresents().size());
        assertEquals("Toy", shopping.getPresents().get(0).getDescription());
        assertEquals("Laptop", shopping.getPresents().get(1).getDescription());
        assertEquals("Sweater", shopping.getPresents().get(2).getDescription());
    }

    @Test
    void testAddNewPresent() {
        shopping.addNewPresent(new ChristmasPresent("Socks", "Jane", 2000));
        assertEquals(4, shopping.getPresents().size());
        assertEquals("Socks", shopping.getPresents().get(3).getDescription());
        assertEquals("Jane", shopping.getPresents().get(3).getRecipient());
        assertEquals(2000, shopping.getPresents().get(3).getPrice());
    }

    @Test
    void testRemoveOverpricedPresents() {
        shopping.removeOverpricedPresents(5000);
        assertEquals(2, shopping.getPresents().size());
        assertEquals("Toy", shopping.getPresents().get(0).getDescription());
        assertEquals("Sweater", shopping.getPresents().get(1).getDescription());
    }
}
