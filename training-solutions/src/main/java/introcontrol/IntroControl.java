package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number > 10) return number - 10;
        return number;
    }

    public String describeNumber(int number) {
        if (number == 0) return "zero";
        return "not zero";
    }

    public String greetJoe(String name) {
        if ("Joe".equals(name)) return "Hello Joe";
        return "";
    }

    public int calculateBonus(int sale) {
        if (sale >= 1_000_000) return sale / 10;
        return 0;
    }

    public int calculateConsumption(int prev, int next) {
        if (next < prev) return next + 9999 - prev;
        return next - prev;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i + (i != max ? "; " : "\n"));
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + (i != max ? "; " : "\n"));
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + (i != b ? "; " : "\n"));
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + (i != b ? "; " : "\n"));
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i += 2) {
            System.out.print(i + (i <= max - 2 ? "; " : "\n"));
        }
    }
}
