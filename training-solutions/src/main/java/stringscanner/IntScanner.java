package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public static void main(String[] args) {
        IntScanner is = new IntScanner();
        System.out.println("1: " + is.convertInts("5;3;107;12;123;18;198"));
        System.out.println("2: " + is.convertInts("107"));
        System.out.println("3: " + is.convertInts("5;3;12;18"));
        System.out.println("4: " + is.convertInts(""));
    }

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints);
        scanner.useDelimiter(";");
        StringBuilder result = new StringBuilder();
        boolean first = true;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i <= 100) continue;
            if (first) first = false;
            else result.append(',');
            result.append(i);
        }
        scanner.close();
        return result.toString();
    }
}
