package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        List<String> words = Arrays.asList("apple", "tables", "business", "trim");
        assertTrue(Word.containsLongerWord(words, 8));
        assertFalse(Word.containsLongerWord(words, 9));
    }
}
