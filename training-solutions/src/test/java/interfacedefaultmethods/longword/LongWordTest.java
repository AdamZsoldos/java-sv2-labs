package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testGetLongWord() {
        String longWord = new LongWord().getLongWord(Path.of("src/test/resources/longword.txt"));
        assertEquals("LONGWORD", longWord);
    }
}
