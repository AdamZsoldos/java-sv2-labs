package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter product name:");
        String productName = scanner.nextLine();

        System.out.println("Please enter starting price:");
        int productPrice = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(productName, productPrice);

        commandLoop:
        while (true) {

            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());

            System.out.println("Enter command:");
            System.out.println("I - Increase price");
            System.out.println("D - Decrease price");
            System.out.println("Q - Quit");
            String command = scanner.nextLine();

            switch (command.toUpperCase()) {
                case "I":
                    System.out.println("Increase price by:");
                    product.increasePrice(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "D":
                    System.out.println("Decrease price by:");
                    product.decreasePrice(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "Q":
                    break commandLoop;
            }

        }

    }
}
