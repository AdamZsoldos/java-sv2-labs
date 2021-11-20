package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRegistration:");
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        String ageString = scanner.nextLine();
        System.out.println("\nName: " + name);
        System.out.println("Age: " + ageString + '\n');
        boolean success = true;
        try {
            Validate.validateName(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            success = false;
        }
        try {
            Validate.validateAge(ageString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            success = false;
        }
        System.out.println(success ? "Registration complete!" : "Registration unsuccessful!");
    }
}
