package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void testCreate() {
        SimpleTime time = new SimpleTime(9, 5);
        assertEquals(9, time.getHour());
        assertEquals(5, time.getMinute());
    }

    @Test
    void testCreateWithTimeString() {
        SimpleTime time = new SimpleTime("09:05");
        assertEquals(9, time.getHour());
        assertEquals(5, time.getMinute());
    }

    @Test
    void testCreateHourTooLow() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime(-1, 5));
        assertEquals("Hour is invalid (0-23)", e.getMessage());
    }

    @Test
    void testCreateHourTooHigh() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime(24, 5));
        assertEquals("Hour is invalid (0-23)", e.getMessage());
    }

    @Test
    void testCreateMinuteTooLow() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime(9, -1));
        assertEquals("Minute is invalid (0-59)", e.getMessage());
    }

    @Test
    void testCreateMinuteTooHigh() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime("09:60"));
        assertEquals("Minute is invalid (0-59)", e.getMessage());
    }

    @Test
    void testCreateStringTooShort() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime("09:5"));
        assertEquals("Time is not hh:mm", e.getMessage());
    }

    @Test
    void testCreateStringTooLong() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime("09:005"));
        assertEquals("Time is not hh:mm", e.getMessage());
    }

    @Test
    void testCreateStringNotProperlyDelimited() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime("09_05"));
        assertEquals("Time is not hh:mm", e.getMessage());
    }

    @Test
    void testCreateStringContainsNondigit() {
        InvalidTimeException e = assertThrows(InvalidTimeException.class, () -> new SimpleTime("09:a5"));
        assertEquals("Time is not hh:mm", e.getMessage());
    }

    @Test
    void testCreateWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new SimpleTime(null));
        assertEquals("Time is null", e.getMessage());
    }

    @Test
    void testToString() {
        SimpleTime time = new SimpleTime(9, 5);
        assertEquals("09:05", time.toString());
    }
}
