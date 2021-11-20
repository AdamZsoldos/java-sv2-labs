package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorMain calculator = new CalculatorMain();
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
            System.out.println(Calculator.calculate(i, j, op));
        }
        catch (ArithmeticException e) {
            System.out.println("NaN");
        }
    }
}
