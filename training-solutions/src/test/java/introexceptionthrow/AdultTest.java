package introexceptionthrow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultTest {

    @Test
    void testCreateTooYoung() {
        assertThrows(IllegalStateException.class, () -> new Adult("John Doe", 17));
    }

    @Test
    void testCreate() {
        Adult adult = new Adult("Jane Doe", 18);
        assertEquals("Jane Doe", adult.getName());
        assertEquals(18, adult.getAge());
    }
}
