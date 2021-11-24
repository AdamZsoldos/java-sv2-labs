package algorithmsrecursion;

import java.util.Arrays;

public class Numbers {

    private Numbers() {
        throw new IllegalStateException("Utility class");
    }

    public static int getSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];
        return numbers[numbers.length - 1] + getSum(Arrays.copyOf(numbers, numbers.length - 1));
    }
}
