package exceptionclass.course;

public final class SimpleTime {

    private final int hour;
    private final int minute;

    public SimpleTime(int hour, int minute) {
        validateHour(hour);
        validateMinute(minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time) {
        validateTimeString(time);
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3));
        validateHour(hour);
        validateMinute(minute);
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    private void validateHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private void validateTimeString(String s) {
        if (s.length() != 5) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        for (int i = 0; i < s.length(); i++) {
            if ((i != 2 && !Character.isDigit(s.charAt(i)) || (i == 2 && s.charAt(i) != ':'))) {
                throw new InvalidTimeException("Time is not hh:mm");
            }
        }
    }
}
