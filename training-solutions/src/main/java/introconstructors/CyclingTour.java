package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private final String description;
    private final LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPeople(int people) {
        numberOfPeople += people;
    }

    public void ride(double km) {
        kms += km;
    }
}
