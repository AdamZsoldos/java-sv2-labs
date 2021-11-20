package introexceptiontrycatchtrace;

public class Calculator {

    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static int add(int i, int j) {
        return i + j;
    }

    public static int subtract(int i, int j) {
        return i - j;
    }

    public static int multiply(int i, int j) {
        return i * j;
    }

    public static int divide(int i, int j) {
        return i / j;
    }

    public static int calculate(int i, int j, String op) {
        return switch (op) {
            case "+" -> add(i, j);
            case "-" -> subtract(i, j);
            case "*" -> multiply(i, j);
            case "/" -> divide(i, j);
            default -> 0;
        };
    }
}
