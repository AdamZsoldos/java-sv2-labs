package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testNext() {
        TypeWriterState state = TypeWriterState.CAPS_LOCK_OFF;
        state = state.next();
        assertEquals(TypeWriterState.CAPS_LOCK_ON, state);
        state = state.next();
        assertEquals(TypeWriterState.CAPS_LOCK_OFF, state);
    }
}
