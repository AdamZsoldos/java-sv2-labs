package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("a book", "a tent", "a bedroll");
        System.out.println("importantThings: " + importantThings);

        importantThings.set(0, "a fridge full of food and drinks");
        System.out.println("importantThings: " + importantThings);
    }
}
