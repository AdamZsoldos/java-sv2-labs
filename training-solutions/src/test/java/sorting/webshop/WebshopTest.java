package sorting.webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebshopTest {

    Webshop webshop = new Webshop();

    @BeforeEach
    void setUp() {
        webshop.getProducts().add(new Product("Banana", 50, LocalDateTime.of(2000, 1, 1, 10, 0)));
        webshop.getProducts().add(new Product("Apple", 60, LocalDateTime.of(2000, 1, 1, 9, 50)));
        webshop.getProducts().add(new Product("Pear", 100, LocalDateTime.of(2000, 1, 3, 10, 0)));
        webshop.getProducts().add(new Product("Strawberry", 20, LocalDateTime.of(2001, 1, 1, 9, 15)));
        webshop.getProducts().add(new Product("Yoghurt", 70, LocalDateTime.of(2000, 1, 1, 9, 25)));
        webshop.getProducts().add(new Product("Milk", 120, LocalDateTime.of(2000, 1, 1, 11, 15)));
    }

    @Test
    void testGetProductsSortedByName() {
        List<Product> products = webshop.getProductsSortedByName();
        assertEquals(6, products.size());
        assertEquals("Apple", products.get(0).getName());
        assertEquals("Yoghurt", products.get(5).getName());
        assertEquals("Banana", webshop.getProducts().get(0).getName());
    }

    @Test
    void testGetProductsSortedByPrice() {
        List<Product> products = webshop.getProductsSortedByPrice();
        assertEquals(6, products.size());
        assertEquals("Strawberry", products.get(0).getName());
        assertEquals("Milk", products.get(5).getName());
        assertEquals("Banana", webshop.getProducts().get(0).getName());
    }

    @Test
    void testGetProductsSortedByDate() {
        List<Product> products = webshop.getProductsSortedByDate();
        assertEquals(6, products.size());
        assertEquals("Yoghurt", products.get(0).getName());
        assertEquals("Strawberry", products.get(5).getName());
        assertEquals("Banana", webshop.getProducts().get(0).getName());
    }
}
