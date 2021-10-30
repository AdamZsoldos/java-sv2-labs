package stringbuilder.palindrome;

public class PalindromeValidatorMain {
    public static void main(String[] args) {

        System.out.println();
        String phrase1 = "Murder for a jar of red rum.";
        String phrase1Alphabetic = PalindromeValidator.getAlphabeticString(phrase1);
        System.out.println(phrase1);
        System.out.println(phrase1Alphabetic);
        System.out.println(new StringBuilder(phrase1Alphabetic).reverse());
        System.out.println("Is palindrome: " + PalindromeValidator.isPalindrome(phrase1));

        System.out.println();
        String phrase2 = "Murder for some jars of red rum.";
        String phrase2Alphabetic = PalindromeValidator.getAlphabeticString(phrase2);
        System.out.println(phrase2);
        System.out.println(phrase2Alphabetic);
        System.out.println(new StringBuilder(phrase2Alphabetic).reverse());
        System.out.println("Is palindrome: " + PalindromeValidator.isPalindrome(phrase2));
    }
}
