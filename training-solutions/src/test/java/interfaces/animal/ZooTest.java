package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo = new Zoo(Arrays.asList(
            new Duck(),
            new Lion(),
            new Worm()
    ));

    @Test
    void testGetNumberOfAnimals() {
        assertEquals(3, zoo.getNumberOfAnimals());
    }

    @Test
    void testGetNumberOfAllLegs() {
        assertEquals(6, zoo.getNumberOfAllLegs());
    }
}
