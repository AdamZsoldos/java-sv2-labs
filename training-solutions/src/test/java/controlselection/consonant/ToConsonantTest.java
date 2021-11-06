package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void testToConsonant() {
        assertEquals(0, ToConsonant.toConsonant(' '));
        assertEquals('b', ToConsonant.toConsonant('a'));
        assertEquals('b', ToConsonant.toConsonant('A'));
        assertEquals('f', ToConsonant.toConsonant('e'));
        assertEquals('f', ToConsonant.toConsonant('E'));
        assertEquals('j', ToConsonant.toConsonant('i'));
        assertEquals('j', ToConsonant.toConsonant('I'));
        assertEquals('p', ToConsonant.toConsonant('o'));
        assertEquals('p', ToConsonant.toConsonant('O'));
        assertEquals('v', ToConsonant.toConsonant('u'));
        assertEquals('v', ToConsonant.toConsonant('U'));
        assertEquals('b', ToConsonant.toConsonant('b'));
        assertEquals('b', ToConsonant.toConsonant('B'));
    }
}
