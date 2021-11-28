package defaultconstructor.date;

public class SimpleDate {

    private int year = 1900;
    private int month = 1;
    private int day = 1;

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) return false;
        if (month < 1) return false;
        if (month > 12) return false;
        if (day < 1) return false;
        if (day > calculateMonthLength(year, month)) return false;
        return true;
    }

    private int calculateMonthLength(int year, int month) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return true;
    }
}
