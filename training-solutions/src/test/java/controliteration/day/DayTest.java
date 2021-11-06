package controliteration.day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    @Test
    void testSetDayPeriod() {
        Day day = new Day();
        for (int i = 0; i < 24; i++) {
            day.addHour(new Hour(i));
        }
        day.setDayPeriod();
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(5).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(6).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(22).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(23).getPeriod());
    }
}
