package constructoroverloading.bus;

public class SimpleTime {

    private final int hours;
    private final int minutes;

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int minutesTo(SimpleTime time) {
        return ((time.hours - hours) * 60) + (time.minutes - minutes);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
