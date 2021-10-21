package debug;

import java.util.Arrays;
import java.util.Random;

public class Star {

    public static void main(String[] args) {
        int[] numbers = new int[8];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int prev = i == 0 ? 0 : numbers[i - 1];
            numbers[i] = random.nextInt(prev + 1, prev + 8);
        }
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println();

        writeStars(numbers);
    }

    public static void writeStars(int[] numbers) {
        int prev = 0;
        for (int number: numbers) {
            int stars = number - prev;
            printStars(stars);
            prev = number;
            System.out.println();
        }
    }

    private static void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
}
