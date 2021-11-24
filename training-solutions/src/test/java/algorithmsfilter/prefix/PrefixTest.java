package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        List<String> words = Arrays.asList("alma", "körte", "almafa", "körtefa");
        assertEquals(Arrays.asList("alma", "almafa"), Prefix.getWordsStartWith(words, "alma"));
    }
}
