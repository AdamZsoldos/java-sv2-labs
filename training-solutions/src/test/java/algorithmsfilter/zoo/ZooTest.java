package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        Zoo zoo = new Zoo(Arrays.asList(
                new Animal("bear", 4),
                new Animal("snake", 0),
                new Animal("dog", 4),
                new Animal("cat", 4),
                new Animal("spider", 8)
        ));
        List<Animal> filtered = new ArrayList<>();
        filtered.add(zoo.getAnimals().get(0));
        filtered.add(zoo.getAnimals().get(2));
        filtered.add(zoo.getAnimals().get(3));
        assertEquals(filtered, zoo.getAnimalsWithNumberOfLegsGiven(4));
    }
}
