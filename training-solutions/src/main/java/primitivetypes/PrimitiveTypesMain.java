package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        int a = 2;
        Integer b = 2; //Autoboxing
        Integer c = a; //Autoboxing
        Integer d = b;
        Integer e = Integer.valueOf(2);
        int f = Integer.valueOf(2); //Autounboxing
        int g = Integer.valueOf(a); //Autounboxing
        int h = Integer.valueOf(c); //Autounboxing ×2
        int i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2"); //Autoboxing

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
