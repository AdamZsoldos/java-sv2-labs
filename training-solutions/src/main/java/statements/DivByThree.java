package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int i = scanner.nextInt();

        System.out.println("The integer " + i + " " + (i % 3 == 0 ? "is" : "isn't") + " divisible by three.");
    }
}
