package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int int1 = scanner.nextInt();

        System.out.println("Enter second integer:");
        int int2 = scanner.nextInt();

        System.out.println("Operation: " + int1 + " + " + int2);
        System.out.println("Result: " + (int1 + int2));

    }

}
