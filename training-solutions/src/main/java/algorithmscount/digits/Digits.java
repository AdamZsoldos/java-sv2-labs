package algorithmscount.digits;

public class Digits {

    private Digits() {
        throw new IllegalStateException("Utility class");
    }

    public static int countNumbers() {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (getDigitDifference(i) == 5) count++;
        }
        return count;
    }

    public static int getDigitDifference(int number) {
        int digit1 = number / 10;
        int digit2 = number % 10;
        return Math.abs(digit1 - digit2);
    }
}
