package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        //Concatenation
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + 2);

        //Division
        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3.0 / 4;
        System.out.println(quotient);

        //Large number
        long big = 3_244_444_444L;
        System.out.println(big);

        //String literal as object
        String word = "title".toUpperCase();
        System.out.println(word);

        //Int to binary string
        System.out.println(Integer.toString(1, 2));
        System.out.println(Integer.toString(-2, 2));
    }
}
