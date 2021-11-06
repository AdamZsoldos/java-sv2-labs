package controlselection.month;

public class DayInMonth {

    private DayInMonth() {
        throw new IllegalStateException("Utility class");
    }

    public static int getNumberOfDaysInMonth(String monthName, int year) {
        switch (monthName.trim().toLowerCase()) {
            case "január", "március", "május", "július", "augusztus", "október", "december":
                return 31;
            case "április", "június", "szeptember", "november":
                return 30;
            case "február":
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return 29;
                return 28;
            default:
                return 0;
        }
    }
}
