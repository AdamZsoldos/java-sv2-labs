package algorithmssum;

public class TwoDigitEvens {

    private TwoDigitEvens() {
        throw new IllegalStateException("Utility class");
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 11; i <= 99; i += 2) {
            if (i % 5 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
