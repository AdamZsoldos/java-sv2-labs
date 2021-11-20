package introexceptionthrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        int i;

        try {
            i = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not an integer!");
            return;
        }

        try {
            if (i < 1) {
                throw new IllegalArgumentException("Not positive!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(i);
    }
}
