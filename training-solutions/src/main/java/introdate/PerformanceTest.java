package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("Deftones", LocalDate.now(), LocalTime.of(19, 15), LocalTime.of(20, 45));

        System.out.println("Artist: " + performance.getArtist());
        System.out.println("Date: " + performance.getDate());
        System.out.println("Start time: " + performance.getStartTime());
        System.out.println("End time: " + performance.getEndTime());
        System.out.println("Performance info:");
        System.out.println(performance.getInfo());
    }
}
