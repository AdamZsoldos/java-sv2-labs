package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testIsEqual() {
        assertTrue(new Time().isEqual(new Time()));
        assertTrue(new Time(8, 15, 10).isEqual(new Time(8, 15, 10)));
        assertFalse(new Time(8, 15, 10).isEqual(new Time(8, 15, 11)));
        assertTrue(new Time(8, 15, 10).isEqual(8, 15, 10));
        assertFalse(new Time(8, 15, 10).isEqual(8, 15, 11));
    }

    @Test
    void testIsEarlier() {
        assertFalse(new Time().isEarlier(new Time()));
        assertFalse(new Time(8, 15, 10).isEarlier(new Time(8, 15, 10)));
        assertFalse(new Time(8, 15, 10).isEarlier(new Time(8, 15, 9)));
        assertTrue(new Time(8, 15, 10).isEarlier(new Time(8, 15, 11)));
        assertFalse(new Time(8, 15, 10).isEarlier(8, 15, 10));
        assertFalse(new Time(8, 15, 10).isEarlier(8, 15, 9));
        assertTrue(new Time(8, 15, 10).isEarlier(8, 15, 11));
    }
}
