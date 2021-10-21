package looptypes;

import java.util.Arrays;
import java.util.Random;

public class Sum {

    public static void main(String[] args) {
        int[] numbers = new int[12];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) numbers[i] = random.nextInt(1, 100);
        System.out.println("numbers: " + Arrays.toString(numbers));

        System.out.print("printSums(numbers): ");
        printSums(numbers);
    }

    public static void printSums(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) System.out.print(numbers[i - 1] + numbers[i] + " ");
        System.out.println();
    }
}
