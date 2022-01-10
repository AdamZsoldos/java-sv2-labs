package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testGetFullNames() {
        List<String> expected = List.of("Szabó Emese", "Szabó Ferenc");
        assertEquals(expected, siblings.getFullNames("Szabó", Path.of("src/test/resources/siblings.txt")));
    }

    @Test
    void testGetFullNamesWithInvalidPath() {
        assertThrows(IllegalStateException.class, () -> siblings.getFullNames("Szabó", Path.of("src/test/resources/siblings_.txt")), "Cannot read file");
    }
}
