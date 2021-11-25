package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testCreate() {
        Human human = new Human();
        human.setName("John Doe");
        human.setWeight(80.0);
        human.setIq(100);
        assertEquals("John Doe", human.getName());
        assertEquals(80.0, human.getWeight());
        assertEquals(100, human.getIq());
    }
}
