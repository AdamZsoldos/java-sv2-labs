package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your credentials in order to register.");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Month of birth: ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Day of birth: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Email address: ");
        String email = scanner.nextLine();

        Person person = new Person(generateName(firstName, lastName), generateDate(yearOfBirth, monthOfBirth, dayOfBirth), email);

        System.out.println("Thank you. You have registered with the following credentials:");
        System.out.println(person);
    }

    public static String generateName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static LocalDate generateDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
