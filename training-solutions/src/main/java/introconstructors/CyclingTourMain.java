package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("May Bike Tour", LocalDate.of(2022, 5, 1));

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPeople(6);
        cyclingTour.ride(26.4);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
