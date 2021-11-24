package algorithmscount.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testCountNumbers() {
        assertEquals(9, Digits.countNumbers());
    }

    @Test
    void testGetDigitDifference() {
        assertEquals(1, Digits.getDigitDifference(54));
        assertEquals(4, Digits.getDigitDifference(59));
        assertEquals(2, Digits.getDigitDifference(13));
        assertEquals(8, Digits.getDigitDifference(91));
    }
}
