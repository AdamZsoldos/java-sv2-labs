package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {
        assertEquals(9, Temperature.getMin(Arrays.asList(10, 20, 30, 9, 22)));
    }
}
