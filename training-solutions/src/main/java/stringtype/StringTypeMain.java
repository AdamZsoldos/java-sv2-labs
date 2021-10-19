package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;

        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        String emptyString = "" + "";

        String s = "Abcde";

        System.out.println("prefix: " + prefix);
        System.out.println("name: " + name);
        System.out.println("message: " + message);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println("emptyString: " + emptyString);
        System.out.println("emptyString.length(): " + emptyString.length());

        System.out.println("s: " + s);
        System.out.println(s.charAt(0) + ", " + s.charAt(2));
        System.out.println(s.substring(0, 3));
    }
}
