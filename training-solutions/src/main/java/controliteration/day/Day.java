package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    private final List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour hour : hoursOfDay) {
            if (hour.getHourNumber() >= 6 && hour.getHourNumber() <= 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            } else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
