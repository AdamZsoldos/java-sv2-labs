package controliteration.division;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisionWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int limit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        System.out.println(new DivisionWhile().getNumbersDivisibleBy(divisor, limit));
    }

    public List<Integer> getNumbersDivisibleBy(int divisor, int limit) {
        List<Integer> result = new ArrayList<>();
        int i = divisor;
        while (i < limit) {
            result.add(i);
            i += divisor;
        }
        return result;
    }
}
