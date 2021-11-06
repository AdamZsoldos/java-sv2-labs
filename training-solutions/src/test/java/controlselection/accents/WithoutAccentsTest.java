package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void testRemoveAccents() {
        assertEquals(0, WithoutAccents.removeAccents(' '));
        assertEquals('a', WithoutAccents.removeAccents('a'));
        assertEquals('a', WithoutAccents.removeAccents('á'));
        assertEquals('A', WithoutAccents.removeAccents('Á'));
        assertEquals('e', WithoutAccents.removeAccents('é'));
        assertEquals('E', WithoutAccents.removeAccents('É'));
        assertEquals('i', WithoutAccents.removeAccents('í'));
        assertEquals('I', WithoutAccents.removeAccents('Í'));
        assertEquals('o', WithoutAccents.removeAccents('ó'));
        assertEquals('O', WithoutAccents.removeAccents('Ó'));
        assertEquals('o', WithoutAccents.removeAccents('ö'));
        assertEquals('O', WithoutAccents.removeAccents('Ö'));
        assertEquals('o', WithoutAccents.removeAccents('ő'));
        assertEquals('O', WithoutAccents.removeAccents('Ő'));
        assertEquals('u', WithoutAccents.removeAccents('ú'));
        assertEquals('U', WithoutAccents.removeAccents('Ú'));
        assertEquals('u', WithoutAccents.removeAccents('ü'));
        assertEquals('U', WithoutAccents.removeAccents('Ü'));
        assertEquals('u', WithoutAccents.removeAccents('ű'));
        assertEquals('U', WithoutAccents.removeAccents('Ű'));
    }
}
