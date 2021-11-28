package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable busTimeTable = new BusTimeTable(9, 13, 10);

    @Test
    void testCreate() {
        assertEquals(30, busTimeTable.getTimeTable().size());
        assertEquals("09:00", busTimeTable.getTimeTable().get(0).toString());
        assertEquals("13:50", busTimeTable.getTimeTable().get(29).toString());
    }

    @Test
    void testGetNextBus() {
        assertEquals("09:00", busTimeTable.getNextBus(new SimpleTime(0)).toString());
        assertEquals("13:10", busTimeTable.getNextBus(new SimpleTime(13, 10)).toString());
        assertEquals("13:20", busTimeTable.getNextBus(new SimpleTime(13, 11)).toString());
        assertEquals("13:50", busTimeTable.getNextBus(new SimpleTime(13, 50)).toString());
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> busTimeTable.getNextBus(new SimpleTime(13, 51)));
        assertEquals("There are no buses available for the day after the given time.", e.getMessage());
    }
}
