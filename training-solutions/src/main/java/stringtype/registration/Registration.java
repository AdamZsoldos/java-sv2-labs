package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

        System.out.println("New user registration; please enter your credentials.");
        System.out.println("Username:");
        String username = scanner.nextLine().trim();

        System.out.println("Password:");
        String password1 = scanner.nextLine().trim();

        System.out.println("Confirm password:");
        String password2 = scanner.nextLine().trim();

        System.out.println("Email address:");
        String email = scanner.nextLine().trim();

        System.out.println(validator.isValidUsername(username) ? "Username is valid." : "Invalid username!");
        System.out.println(validator.isValidPassword(password1, password2) ? "Password is valid." : "Invalid password!");
        System.out.println(validator.isValidEmail(email) ? "Email address is valid." : "Invalid email address!");
    }
}
