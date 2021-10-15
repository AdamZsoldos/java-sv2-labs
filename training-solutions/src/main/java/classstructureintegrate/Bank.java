package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your account details.");
        System.out.println("Your name:");
        String owner = scanner.nextLine();

        System.out.println("Your account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Your account balance:");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, owner, balance);

        commandLoop:
        while (true) {

            System.out.println("Your account details:");
            System.out.println(account.getInfo());

            System.out.println("Enter command:");
            System.out.println("D - Deposit");
            System.out.println("W - Withdraw");
            System.out.println("Q - Quit");
            String command = scanner.nextLine();

            switch (command.toUpperCase()) {
                case "D":
                    System.out.println("Enter amount to deposit:");
                    account.deposit(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "W":
                    System.out.println("Enter amount to withdraw:");
                    account.withdraw(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "Q":
                    break commandLoop;
            }

        }

    }
}
