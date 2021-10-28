package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Solve the equation:");

        System.out.print("(1 + (7 - 5) * 3) / 2 = ");
        double answer = Double.parseDouble(scanner.nextLine().trim());
        boolean correct = Math.abs(((1 + (7 - 5) * 3) / 2.0) - answer) <= 0.0001;

        System.out.println(correct ? "Correct answer." : "Incorrect answer.");
    }
}
