package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void testGetFirstWordWithA() {
        String word = Words.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    void testGetFirstWordWithANoA() {
        String word = Words.getFirstWordWithA(Paths.get("src/test/resources/wordswithout.txt"));
        assertEquals("A", word);
    }

    @Test
    void testGetFirstWordWithAInvalidPath() {
        Path path = Paths.get("src/test/resources/wordsnonexist.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> Words.getFirstWordWithA(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}
