package immutable;

import java.time.LocalDate;

public class Car {

    private final String manufacturer;
    private final String model;
    private final int yearOfProduction;

    public Car(String manufacturer, String model, int yearOfProduction) {
        validateManufacturer(manufacturer);
        validateYearOfProduction(yearOfProduction);
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    private void validateManufacturer(String manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Manufacturer cannot be null!");
        } else if (manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be blank!");
        }
    }

    private void validateYearOfProduction(int yearOfProduction) {
        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot exceed maximum value of current year!");
        }
    }
}
