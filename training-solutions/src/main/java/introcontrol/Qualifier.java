package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be egy egész számot:");
        int i = scanner.nextInt();

        if (i > 100) System.out.println("Nagyobb, mint száz.");
        else System.out.println("Száz, vagy kisebb.");
    }
}
