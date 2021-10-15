package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter email address:");
        String email = scanner.nextLine();

        System.out.println("You have registered with the following credentials:");
        System.out.println("Name: " + name);
        System.out.println("Email address: " + email);

    }

}
