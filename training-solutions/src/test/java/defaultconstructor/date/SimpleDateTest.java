package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate date = new SimpleDate();

    @Test
    void testSetDate() {
        date.setDate(1900, 12, 31);
        assertEquals(1900, date.getYear());
        assertEquals(12, date.getMonth());
        assertEquals(31, date.getDay());
    }

    @Test
    void testSetDateValuesTooLow() {
        IllegalArgumentException e;
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1899, 1, 1));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 0, 1));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 1, 0));
        assertEquals("Invalid date!", e.getMessage());
    }

    @Test
    void testSetDateValuesTooHigh() {
        IllegalArgumentException e;
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 13, 1));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 1, 32));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 4, 31));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1900, 2, 29));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(1904, 2, 30));
        assertEquals("Invalid date!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> date.setDate(2000, 2, 30));
        assertEquals("Invalid date!", e.getMessage());
    }
}
