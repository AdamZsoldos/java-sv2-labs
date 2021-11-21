package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Numbers n = new Numbers();
        Scanner sc = new Scanner(System.in);
        while (n.takeIntegerInput(sc) % 2 != 0) {}
    }

    private int takeIntegerInput(Scanner sc) {
        System.out.print("Enter an even integer: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not an integer!");
        } finally {
            System.out.println("End of round.");
        }
    }
}
