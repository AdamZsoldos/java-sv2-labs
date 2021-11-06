package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void testGetNumberOfDaysInMonth() {
        assertEquals(0, DayInMonth.getNumberOfDaysInMonth("", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Január", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Március", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Május", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Július", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Augusztus", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("Október", 2000));
        assertEquals(31, DayInMonth.getNumberOfDaysInMonth("December", 2000));
        assertEquals(30, DayInMonth.getNumberOfDaysInMonth("Április", 2000));
        assertEquals(30, DayInMonth.getNumberOfDaysInMonth("Június", 2000));
        assertEquals(30, DayInMonth.getNumberOfDaysInMonth("Szeptember", 2000));
        assertEquals(30, DayInMonth.getNumberOfDaysInMonth("November", 2000));
        assertEquals(29, DayInMonth.getNumberOfDaysInMonth("Február", 2000));
        assertEquals(28, DayInMonth.getNumberOfDaysInMonth("Február", 2100));
        assertEquals(29, DayInMonth.getNumberOfDaysInMonth("Február", 2004));
        assertEquals(28, DayInMonth.getNumberOfDaysInMonth("Február", 2001));
    }
}
