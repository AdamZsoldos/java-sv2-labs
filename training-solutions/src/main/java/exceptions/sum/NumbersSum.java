package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        validateNotNull(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        validateNotNull(numbers);
        int sum = 0;
        for (String numberString : numbers) {
            sum += toNumber(numberString);
        }
        return sum;
    }

    private void validateNotNull(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Numbers array is null.");
        }
    }

    private int toNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Array contains nonnumeric strings.");
        }
    }
}
