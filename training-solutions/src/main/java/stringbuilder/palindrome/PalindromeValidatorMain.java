package stringbuilder.palindrome;

public class PalindromeValidatorMain {
    public static void main(String[] args) {

        String phrase1 = "Murder for a jar of red rum.";
        System.out.println(phrase1);
        System.out.println(new StringBuilder(phrase1).reverse());
        System.out.println(PalindromeValidator.isPalindrome(phrase1));

        String phrase2 = "Murder for some jars of red rum.";
        System.out.println(phrase2);
        System.out.println(new StringBuilder(phrase2).reverse());
        System.out.println(PalindromeValidator.isPalindrome(phrase2));
    }
}
