package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void testGetFirstWordWithA() {
        String word = Words.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    public void testGetFirstWordWithANoA() {
        String word = Words.getFirstWordWithA(Paths.get("src/test/resources/wordswithout.txt"));
        assertEquals("A", word);
    }

    @Test
    public void testGetFirstWordWithAInvalidPath() {
        Path path = Paths.get("src/test/resources/wordsnonexist.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> Words.getFirstWordWithA(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}
