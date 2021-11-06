package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Please enter length of Fibonacci sequence to generate: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        List<Long> sequence = new ArrayList<>();
        int i = 0;
        while (i < number) {
            sequence.add(i < 2 ? i : sequence.get(i - 2) + sequence.get(i - 1));
            i++;
        }
        System.out.println(sequence);
    }
}
