package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testCreate() {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(4);
        dog.setPedigree(true);
        dog.setWeight(20.0);
        assertEquals("Rex", dog.getName());
        assertEquals(4, dog.getAge());
        assertTrue(dog.isPedigree());
        assertEquals(20.0, dog.getWeight());
    }
}
