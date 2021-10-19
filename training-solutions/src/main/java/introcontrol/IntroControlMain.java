package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl ic = new IntroControl();

        System.out.println(ic.subtractTenIfGreaterThanTen(10) + "; " + ic.subtractTenIfGreaterThanTen(11));

        System.out.println(ic.describeNumber(0) + "; " + ic.describeNumber(-1));

        System.out.println(ic.greetJoe("Joe") + "; " + ic.greetJoe("Kimberly"));

        System.out.println(ic.calculateBonus(990_000) + "; " + ic.calculateBonus(1_000_000) + "; " + ic.calculateBonus(1_620_000));

        System.out.println(ic.calculateConsumption(9800, 9900) + "; " + ic.calculateConsumption(9900, 120) + "; " + ic.calculateConsumption(120, 9900));

        ic.printNumbers(8);

        ic.printNumbersBetween(6, 14);

        ic.printNumbersBetweenAnyDirection(6, -12);
        ic.printNumbersBetweenAnyDirection(-7, 9);
        ic.printNumbersBetweenAnyDirection(-10, -10);

        ic.printOddNumbers(10);
        ic.printOddNumbers(11);
    }
}
