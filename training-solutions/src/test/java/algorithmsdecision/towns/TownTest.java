package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        List<Integer> populationList = Arrays.asList(300, 450, 250, 600);
        assertTrue(Town.containsFewerHabitants(populationList, 250));
        assertFalse(Town.containsFewerHabitants(populationList, 249));
    }
}
