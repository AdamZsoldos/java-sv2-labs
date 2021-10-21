package math.math;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        float f = (float) -4.67;
        System.out.println(f);
        System.out.println(Math.abs(f));
        System.out.println(Math.negateExact(82));
        System.out.println(Math.addExact(3, 4));
        System.out.println(Math.subtractExact(3, 4));
        System.out.println(Math.multiplyExact(3, 4));
        System.out.println(Math.pow(3, 4));
        System.out.println(Math.incrementExact(0));
        System.out.println(Math.decrementExact(0));
        System.out.println(Math.random());
    }
}
