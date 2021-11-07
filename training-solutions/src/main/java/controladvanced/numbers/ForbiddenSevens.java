package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {
        System.out.println();
        System.out.print("Please enter a positive integer: ");
        int number = new Scanner(System.in).nextInt();

        while (true) {
            if (number % 7 == 0) System.out.println('X');
            else if (String.valueOf(number).contains("7")) break;
            else System.out.println(number);
            number++;
        }
    }
}
