package operators;

public class OperatorsMain {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(14));

        System.out.println(Operators.isEven(3) + " " + Operators.isEven(4));

        System.out.println(Operators.getResultOfDivision(11, 3));

        System.out.println(Operators.isNull(null) + "; " + Operators.isNull("Hello!"));

        System.out.println(Operators.isEmpty(null) + " " + Operators.isEmpty("") + " " + Operators.isEmpty("Hello!"));
    }
}
