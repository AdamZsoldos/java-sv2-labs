package collectionslist.postman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman = new Postman();

    @BeforeEach
    void setUp() {
        postman.getAddresses().add("10 EW");
        postman.getAddresses().add("20 EW");
        postman.getAddresses().add("30 EW");
        postman.getAddresses().add("10 EW");
        postman.getAddresses().add("20 EW");
    }

    @Test
    void testCreate() {
        assertEquals(List.of("10 EW", "20 EW", "30 EW", "10 EW", "20 EW"), postman.getAddresses());
    }

    @Test
    void testRemoveAddress() {
        postman.removeAddress("20 EW");
        assertEquals(List.of("10 EW", "30 EW", "10 EW", "20 EW"), postman.getAddresses());
    }
}
