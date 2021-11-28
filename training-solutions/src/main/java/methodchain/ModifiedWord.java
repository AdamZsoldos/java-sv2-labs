package methodchain;

import java.util.Arrays;

public class ModifiedWord {

    private ModifiedWord() {
        throw new IllegalStateException("Utility class");
    }

    public static String modify(String word) {
        if (word == null || word.length() < 4) {
            throw new IllegalArgumentException("Word must be at least 4 characters long!");
        }
        char[] chars = Arrays.copyOf(word.toCharArray(), 4);
        chars[0] = Character.toUpperCase(chars[0]);
        chars[1] = 'x';
        chars[2] = Character.toUpperCase(chars[2]);
        chars[3] = 'y';
        return new String(chars);
    }
}
