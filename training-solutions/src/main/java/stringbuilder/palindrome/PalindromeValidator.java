package stringbuilder.palindrome;

public class PalindromeValidator {

    private PalindromeValidator() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPalindrome(String phrase) {
        phrase = getAlphabeticString(phrase);
        StringBuilder reversePhrase = new StringBuilder(phrase);
        reversePhrase.reverse();
        return reversePhrase.toString().equalsIgnoreCase(phrase);
    }

    public static String getAlphabeticString(String phrase) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isAlphabetic(phrase.charAt(i))) result.append(phrase.charAt(i));
        }
        return result.toString();
    }
}
