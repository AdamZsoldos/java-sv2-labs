package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Words w = new Words();

        String[] words = new String[] {
                "cipőfűző",
                "Lánchíd",
                "rádió"
        };
        boolean[] ignoreCase = new boolean[] {
                true,
                false,
                true
        };

        for (int i = 0; i < words.length; i++) {
            w.conductSpellingTest(words[i], ignoreCase[i], scanner);
        }
    }

    public void conductSpellingTest(String goalWord, boolean ignoreCase, Scanner scanner) {
        System.out.println();
        System.out.print("Spell the word " + goalWord + ": ");
        String word = scanner.nextLine().trim();
        System.out.println();

        char[] goalChars = goalWord.toCharArray();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length || i < goalChars.length; i++) {
            if (i < chars.length && i < goalChars.length) {
                if (areEqual(String.valueOf(chars[i]), String.valueOf(goalChars[i]), ignoreCase)) System.out.println(chars[i] + " - Correct character");
                else System.out.println(chars[i] + " - Incorrect character [" + goalChars[i] + "]");
            }
            else if (i < goalChars.length) System.out.println("Character missing [" + goalChars[i] + "]");
            else System.out.println(chars[i] + " - Extra character");
        }

        System.out.println();
        System.out.println(word + (areEqual(word, goalWord, ignoreCase) ? " - Correct spelling!" : " - Incorrect spelling."));
    }

    public boolean areEqual(String s1, String s2, boolean ignoreCase) {
        return (ignoreCase && s1.equalsIgnoreCase(s2)) || s1.equals(s2);
    }
}
