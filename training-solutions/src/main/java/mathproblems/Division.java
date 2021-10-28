package mathproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Division {

    private Division() {
        throw new IllegalStateException("Utility class");
    }

    public static String getDivisorsString(int number) {
        return "Divisors of " + number + ": " + getDivisors(number);
    }

    public static List<Integer> getDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        if (number == 0) return divisors;
        if (number > 0) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) divisors.add(i);
            }
        } else {
            for (int i = -1; i >= number / 2; i--) {
                if (number % i == 0) divisors.add(i);
            }
        }
        divisors.add(number);

        return divisors;
    }

    public static String getDivisibleByIndexString(int[] numbers) {
        return "Original array: " + Arrays.toString(numbers) + "\nElements of original array divisible by their index: " + Arrays.toString(getDivisibleByIndex(numbers));
    }

    public static int[] getDivisibleByIndex(int[] numbers) {
        int[] divisibleNumbers = new int[numbers.length];
        int totalDivisible = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0) {
                divisibleNumbers[totalDivisible] = numbers[i];
                totalDivisible++;
            }
        }

        return Arrays.copyOf(divisibleNumbers, totalDivisible);
    }
}
