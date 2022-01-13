package sorting.car;

public class Car {

    private final String brand;
    private final int yearOfConstruction;
    private final int price;

    public Car(String brand, int yearOfConstruction, int price) {
        this.brand = brand;
        this.yearOfConstruction = yearOfConstruction;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public int getPrice() {
        return price;
    }
}
