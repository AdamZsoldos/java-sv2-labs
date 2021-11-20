package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        ShortWord sw = new ShortWord();
        System.out.println("Please enter a word 5 or less characters long:");
        String word = new Scanner(System.in).nextLine().trim();
        sw.validateLength(word, 5);
        sw.validateComposition(word);
        System.out.println(word);
    }

    public void validateLength(String s, int maxLength) {
        if (s.length() < 1) {
            throw new IllegalArgumentException("Empty string!");
        } else if (s.length() > 5) {
            throw new IllegalArgumentException("String too long! Length: " + s.length() + "; maximum length: " + maxLength + ".");
        }
    }

    public void validateComposition(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                throw new IllegalArgumentException("String contains nonalphabetic characters!");
            }
        }
    }
}
