package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter five integers:");

        int[] ints = new int[5];
        int sum = 0;
        String s = "";

        for (int i = 0; i < 5; i++) {
            ints[i] = scanner.nextInt();
            scanner.nextLine();
            sum += ints[i];
            s += i == 0 ? ints[i] : " + " + ints[i];
        }

        s += " = " + sum;
        System.out.println(s);
    }
}
