package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testNext() {
        assertEquals(SeatHeaterState.LEVEL_THREE, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.LEVEL_ONE.next());
        assertEquals(SeatHeaterState.LEVEL_ONE, SeatHeaterState.LEVEL_TWO.next());
        assertEquals(SeatHeaterState.LEVEL_TWO, SeatHeaterState.LEVEL_THREE.next());
    }
}
