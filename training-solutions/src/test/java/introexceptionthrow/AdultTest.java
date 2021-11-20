package introexceptionthrow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultTest {

    @Test
    void testCreateTooYoung() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> new Adult("John Doe", 17));
        assertEquals("Age must be 18+!", e.getMessage());
    }

    @Test
    void testCreate() {
        Adult adult = new Adult("Jane Doe", 18);
        assertEquals("Jane Doe", adult.getName());
        assertEquals(18, adult.getAge());
    }
}
