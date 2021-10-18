package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        boolean b = false;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println(i + " " + j + " " + k);

        String s = "Hello World";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            System.out.println("Block begin");
            int x = 0;
            System.out.println(x);
            System.out.println(a);
            System.out.println("Block end");
        }

        //System.out.println(x); // Cannot access variable x outside the block where it is defined
    }
}
