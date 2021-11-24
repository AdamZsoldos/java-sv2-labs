package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        List<String> words = Arrays.asList("apple", "a", "", "ap", "pear");
        List<String> result = Arrays.asList("ap", "a", "", "ap", "pe");
        assertEquals(result, TwoLetters.getFirstTwoLetters(words));
    }
}
