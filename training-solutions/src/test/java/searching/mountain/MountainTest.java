package searching.mountain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    Mountain mountain = new Mountain(new int[]{906, 640, 460, 578, 306});

    @Test
    void testCreate() {
        assertArrayEquals(new int[]{306, 460, 578, 640, 906}, mountain.getPikes());
    }

    @Test
    void testSearchPike() {
        assertTrue(mountain.searchPike(new Pike("Pike A", 578)));
        assertFalse(mountain.searchPike(new Pike("Pike B", 594)));
    }
}
