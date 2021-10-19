package statements;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        authenticate();
    }

    public int getInMinutes() {
        return hour * 60 + minute;
    }

    public int getInSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public boolean earlierThan(Time otherTime) {
        return getInSeconds() < otherTime.getInSeconds();
    }

    public boolean equals(Time otherTime) {
        return getInSeconds() == otherTime.getInSeconds();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    private void authenticate() {

        while (second < 0) {
            second += 60;
            minute--;
        }

        while (second >= 60) {
            second -= 60;
            minute--;
        }

        while (minute < 0) {
            minute += 60;
            hour--;
        }

        while (minute >= 60) {
            minute -= 60;
            hour--;
        }

        while (hour < 0) {
            hour += 24;
        }

        while (hour >= 24) {
            hour -= 24;
        }
    }
}
