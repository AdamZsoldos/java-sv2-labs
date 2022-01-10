package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testGetHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Path.of("src/test/resources/hiddenword.txt")));
    }

    @Test
    void testGetHiddenWordWithInvalidPath() {
        assertThrows(IllegalStateException.class, () -> hiddenWord.getHiddenWord(Path.of("src/test/resources/hiddenword_.txt")), "Cannot read file");
    }
}
