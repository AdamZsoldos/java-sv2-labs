package controlselection.week;

public class DayOfWeeks {

    private DayOfWeeks() {
        throw new IllegalStateException("Utility class");
    }

    public static String getPartOfWeek(String dayName) {
        return switch (dayName.trim().toLowerCase()) {
            case "hétfő" -> "hét eleje";
            case "kedd", "szerda", "csütörtök" -> "hét közepe";
            case "péntek" -> "majdnem hétvége";
            case "szombat", "vasárnap" -> "hétvége";
            default -> "ismeretlen nap";
        };
    }
}
