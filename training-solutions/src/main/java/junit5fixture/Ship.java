package junit5fixture;

public record Ship(String name, int yearOfConstruction, double length) {

    public String getName() {
        return name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public double getLength() {
        return length;
    }
}
