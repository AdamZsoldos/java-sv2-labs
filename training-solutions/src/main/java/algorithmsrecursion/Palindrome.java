package algorithmsrecursion;

public class Palindrome {

    private Palindrome() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        if (Character.toLowerCase(s.charAt(0)) != Character.toLowerCase(s.charAt(s.length() - 1))) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
