package linebreak;

public class Car {

    public static void main(String[] args) {
        System.out.print(getBrandAndTypeInSeparateLines("Aston Martin", "DB5"));
    }

    public static String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + System.lineSeparator() + type;
    }
}
