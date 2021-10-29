package numbers;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class PercentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(new Locale("en")));

        System.out.println("Please enter two integers.");

        System.out.print("First integer: ");
        int i1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Second integer: ");
        int i2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println("Percentage calculations:");
        System.out.println(i1 + " * " + i2 + "% = " + df.format(Percent.getValue(i1, i2)));
        System.out.println(df.format(Percent.getBase(i1, i2)) + " * " + i2 + "% = " + i1);
        System.out.println(i1 + " * " + df.format(Percent.getPercentage(i1, i2)) + "% = " + i2);
    }
}
