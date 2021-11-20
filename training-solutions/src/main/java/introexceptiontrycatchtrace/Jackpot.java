package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Jackpot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Winner winner = new Winner();
        do {
            try {
                System.out.print(winner.getWinner());
            } catch (NullPointerException e) {
                System.out.print("No winner today. :(");
            }
        } while (!scanner.nextLine().equalsIgnoreCase("q"));
    }
}
