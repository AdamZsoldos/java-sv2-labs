package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("alma");
        words.addWord("almafa");
        words.addWord("szilva");
        words.addWord("cseresznye");
        words.addWord("asztal");
    }

    @Test
    void testRemoveWordsThatStartWith() {
        List<String> expected = Arrays.asList("szilva", "cseresznye");
        words.removeWordsThatStartWith("a");
        assertEquals(expected, words.getWordList());
    }

    @Test
    void testRemoveWordsWithLength() {
        List<String> expected = Arrays.asList("alma", "cseresznye");
        words.removeWordsWithLength(6);
        assertEquals(expected, words.getWordList());
    }
}
