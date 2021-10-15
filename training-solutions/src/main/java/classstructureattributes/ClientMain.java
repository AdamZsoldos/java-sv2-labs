package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Please enter your name:");
        client.name = scanner.nextLine();

        System.out.println("Please enter your year of birth:");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your home address:");
        client.address = scanner.nextLine();

        System.out.println("Your credentials:");
        System.out.println("Name: " + client.name);
        System.out.println("Year of birth: " + client.yearOfBirth);
        System.out.println("Address: " + client.address);

    }

}
