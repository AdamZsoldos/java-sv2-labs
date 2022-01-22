package lambda.remainder;

import java.util.ArrayList;
import java.util.List;

public class Remainder {

    private Remainder() {
    }

    public static List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>(numbers);
        result.replaceAll(number -> number % divisor);
        return result;
    }
}
