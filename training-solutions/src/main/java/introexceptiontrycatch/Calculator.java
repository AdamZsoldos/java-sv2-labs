package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int i = calculator.readNumber(scanner, "first");
        int j = calculator.readNumber(scanner, "second");
        String op = calculator.readOperator(scanner);

        printCalculation(i, j, op);
    }

    private int readNumber(Scanner scanner, String ordinal) {
        while (true) {
            System.out.print("Enter " + ordinal + " integer: ");
            String s = scanner.nextLine();
            try {
                return Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }

    private String readOperator(Scanner scanner) {
        while (true) {
            System.out.print("Select operator [+-*/]: ");
            String op = scanner.nextLine();
            switch (op) {
                case "+", "-", "*", "/": return op;
                default: System.out.println("Invalid operator!");
            }
        }
    }

    private static void printCalculation(int i, int j, String op) {
        System.out.print(i + " " + op + " " + j + " = ");
        try {
            switch (op) {
                case "+" -> System.out.println(i + j);
                case "-" -> System.out.println(i - j);
                case "*" -> System.out.println(i * j);
                case "/" -> System.out.println(i / j);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("NaN");
        }
    }
}
