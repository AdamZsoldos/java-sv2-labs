package algorithmsdecision.words;

import java.util.List;

public class Word {

    private Word() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean containsLongerWord(List<String> words, int minLength) {
        for (String word : words) {
            if (word.length() >= minLength) return true;
        }
        return false;
    }
}
