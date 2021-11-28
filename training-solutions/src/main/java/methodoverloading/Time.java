package methodoverloading;

public class Time {

    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public boolean isEqual(Time time) {
        return isEqual(time.hours, time.minutes, time.seconds);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (this.hours != hours) return false;
        if (this.minutes != minutes) return false;
        return this.seconds == seconds;
    }

    public boolean isEarlier(Time time){
        return isEarlier(time.hours, time.minutes, time.seconds);
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (this.hours > hours) return false;
        if (this.hours < hours) return true;
        if (this.minutes > minutes) return false;
        if (this.minutes < minutes) return true;
        return this.seconds < seconds;
    }
}
