package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void testGreet() {
        assertEquals("Jó éjt!", Greetings.greet(20,1));
        assertEquals("Jó éjt!", Greetings.greet(4,59));
        assertEquals("Jó reggelt!", Greetings.greet(5,0));
        assertEquals("Jó reggelt!", Greetings.greet(8,59));
        assertEquals("Jó napot!", Greetings.greet(9,0));
        assertEquals("Jó napot!", Greetings.greet(18,29));
        assertEquals("Jó estét!", Greetings.greet(18,30));
        assertEquals("Jó estét!", Greetings.greet(20,0));
    }
}
