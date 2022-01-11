package collectionsmap.classtrip;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip = new ClassTrip();

    @Test
    void testCreate() {
        assertTrue(classTrip.getPayments().isEmpty());
    }

    @Test
    void testLoadPayments() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Kiss József", 12500);
        expected.put("Nagy Béla", 5000);
        expected.put("Szép Virág", 15000);
        classTrip.loadPayments(Path.of("src/test/resources/payments.txt"));
        assertEquals(expected, classTrip.getPayments());
    }

    @Test
    void testLoadPaymentsWithInvalidPath() {
        assertThrows(IllegalStateException.class, () -> classTrip.loadPayments(Path.of("src/test/resources/payments_.txt")), "Cannot read file");
    }
}
