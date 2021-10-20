package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        System.out.println(words);

        boolean firstWord = true;
        for (String word: words) {
            if (word.length() == 6) {
                if (firstWord) {
                    firstWord = false;
                    System.out.print(word);
                } else {
                    System.out.print(", " + word);
                }
            }
        }
        System.out.println();
    }
}
