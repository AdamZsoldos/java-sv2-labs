package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    private Greetings() {
        throw new IllegalStateException("Utility class");
    }

    public static String greet(int hour, int min) {
        LocalTime time = LocalTime.of(hour, min);

        if (time.isBefore(LocalTime.of(5, 0)) || time.isAfter(LocalTime.of(20, 0)))
            return "Jó éjt!";
        else if (time.isBefore(LocalTime.of(9, 0)))
            return "Jó reggelt!";
        else if (time.isBefore(LocalTime.of(18, 30)))
            return "Jó napot!";
        else
            return "Jó estét!";
    }
}
