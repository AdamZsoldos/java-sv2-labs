package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Please enter some text that's delimited with commas and spaces:");
        String s = consoleScanner.nextLine();

        Scanner scanner = new Scanner(s);
        scanner.useDelimiter(", ");

        while (scanner.hasNext()) System.out.println(scanner.next());
        scanner.close();
    }
}
