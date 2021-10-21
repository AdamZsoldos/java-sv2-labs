package looptypesmodify;

import java.util.Arrays;
import java.util.Random;

public class EveryThird {

    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) numbers[i] = random.nextInt(1, 100);
        System.out.println("numbers array:");
        System.out.println(Arrays.toString(numbers));

        changeToZero(numbers);
        System.out.println("numbers array with every third element changed to zero:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void changeToZero(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i -= 3) numbers[i] = 0;
    }
}
