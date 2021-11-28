package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void testModify() {
        assertEquals("AxMy", ModifiedWord.modify("alma"));
        assertEquals("KxRy", ModifiedWord.modify("körte"));
        assertEquals("SxIy", ModifiedWord.modify("szilva"));
    }

    @Test
    void testModifyWordNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> ModifiedWord.modify(null));
        assertEquals("Word must be at least 4 characters long!", e.getMessage());
    }

    @Test
    void testModifyWordTooShort() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> ModifiedWord.modify("alm"));
        assertEquals("Word must be at least 4 characters long!", e.getMessage());
    }
}
