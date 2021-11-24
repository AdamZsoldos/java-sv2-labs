package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetOldestTrainer() {
        assertEquals(91, MaxAgeCalculator.getOldestTrainer(Arrays.asList(
                new Trainer("John Doe", 45),
                new Trainer("Jane Doe", 91),
                new Trainer("Jill Doe", 25),
                new Trainer("Jack Doe", 72)
        )).getAge());
    }
}
