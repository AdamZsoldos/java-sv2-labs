package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege:");
        int fund = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment i = new Investment(fund, interestRate);

        System.out.println("Hozam 50 napra: " + i.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + i.close(80));
        System.out.println("Kivett összeg 90 nap után: " + i.close(90));
    }
}
