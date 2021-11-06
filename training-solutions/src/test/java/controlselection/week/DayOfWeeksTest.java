package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void testGetPartOfWeek() {
        assertEquals("ismeretlen nap", DayOfWeeks.getPartOfWeek(""));
        assertEquals("hét eleje", DayOfWeeks.getPartOfWeek("Hétfő"));
        assertEquals("hét közepe", DayOfWeeks.getPartOfWeek("Kedd"));
        assertEquals("hét közepe", DayOfWeeks.getPartOfWeek("Szerda"));
        assertEquals("hét közepe", DayOfWeeks.getPartOfWeek("Csütörtök"));
        assertEquals("majdnem hétvége", DayOfWeeks.getPartOfWeek("Péntek"));
        assertEquals("hétvége", DayOfWeeks.getPartOfWeek("Szombat"));
        assertEquals("hétvége", DayOfWeeks.getPartOfWeek("Vasárnap"));
    }
}
