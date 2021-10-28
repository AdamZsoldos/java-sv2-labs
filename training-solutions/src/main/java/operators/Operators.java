package operators;

public class Operators {

    private Operators() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String getResultOfDivision(int number, int divisor) {
        return number + " / " + divisor + " = " + (number / divisor) + ", remainder: " + (number % divisor);
    }

    public static String isNull(String s) {
        return s == null ? "is null" : "is not null";
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
