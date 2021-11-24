package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        assertEquals(45, Hill.getMax(Arrays.asList(40, 30, 20, 45, 10)));
    }
}
