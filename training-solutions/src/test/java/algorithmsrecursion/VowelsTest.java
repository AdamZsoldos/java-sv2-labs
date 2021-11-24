package algorithmsrecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testGetNumberOfVowels() {
        assertEquals(0, Vowels.getNumberOfVowels(""));
        assertEquals(0, Vowels.getNumberOfVowels("bcd"));
        assertEquals(1, Vowels.getNumberOfVowels("abcd _\n"));
        assertEquals(2, Vowels.getNumberOfVowels("abcdEFGH"));
        assertEquals(10, Vowels.getNumberOfVowels("aAeEiIoOuU"));
    }
}
