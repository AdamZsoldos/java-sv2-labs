package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        this.timeTable = createTimeTable(firstHour, lastHour, everyMinute);
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actualTime) {
        for (SimpleTime time : timeTable) {
            if (actualTime.minutesTo(time) >= 0) {
                return time;
            }
        }
        throw new IllegalStateException("There are no buses available for the day after the given time.");
    }

    private List<SimpleTime> createTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> result = new ArrayList<>();
        int hour = firstHour;
        int minute = 0;
        while (hour <= lastHour) {
            result.add(new SimpleTime(hour, minute));
            minute += everyMinute;
            if (minute >= 60) {
                minute -= 60;
                hour++;
            }
        }
        return result;
    }
}
