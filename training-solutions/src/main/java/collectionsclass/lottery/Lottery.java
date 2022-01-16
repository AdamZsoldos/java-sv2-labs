package collectionsclass.lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    private Lottery() {
    }

    public static List<Integer> draw(int totalDraws, int totalNumbers, Random random) {
        List<Integer> result = generateNumbers(totalNumbers);
        Collections.shuffle(result, random);
        return result.subList(0, totalDraws);
    }

    public static List<Integer> draw(int totalDraws, int totalNumbers) {
        return draw(totalDraws, totalNumbers, new Random());
    }

    private static List<Integer> generateNumbers(int totalNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= totalNumbers; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
