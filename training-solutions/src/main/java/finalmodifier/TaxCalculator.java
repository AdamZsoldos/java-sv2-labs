package finalmodifier;

import java.util.Scanner;

public class TaxCalculator {

    public static final double VAT = 0.27;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        System.out.println("Price: " + price);
        System.out.println("Tax: " + calculateTax(price));
        System.out.println("Price with tax: " + calculatePriceWithTax(price));
    }

    public static double calculateTax(double price) {
        return price * VAT;
    }

    public static double calculatePriceWithTax(double price) {
        return price + calculateTax(price);
    }
}
