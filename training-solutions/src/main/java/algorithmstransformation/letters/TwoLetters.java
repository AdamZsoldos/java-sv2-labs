package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    private TwoLetters() {
        throw new IllegalStateException("Utility class");
    }

    public static List<String> getFirstTwoLetters(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word == null || word.length() <= 2) {
                result.add(word);
            } else {
                result.add(word.substring(0, 2));
            }
        }
        return result;
    }
}
