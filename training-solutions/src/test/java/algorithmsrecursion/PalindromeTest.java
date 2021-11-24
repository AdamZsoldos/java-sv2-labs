package algorithmsrecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome("aA"));
        assertTrue(Palindrome.isPalindrome("a b A"));
        assertTrue(Palindrome.isPalindrome("abcBA"));
        assertFalse(Palindrome.isPalindrome("a bA"));
        assertFalse(Palindrome.isPalindrome("aba "));
    }
}
