package exceptionmulticatch.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    AnswerStat stat = new AnswerStat(new BinaryStringConverter());

    @Test
    void testConvert() {
        boolean[] expected = {false, false, true, false, true, false, false, true};
        assertArrayEquals(expected, stat.convert("00101001"));
    }

    @Test
    void testConvertContainingNondigit() {
        InvalidBinaryStringException e = assertThrows(InvalidBinaryStringException.class, () -> stat.convert("00101001a"));
        assertEquals(IllegalArgumentException.class, e.getCause().getClass());
        assertEquals("Invalid binary string", e.getCause().getMessage());
    }

    @Test
    void testAnswerTruePercent() {
        assertEquals(37, stat.answerTruePercent("00101001"));
    }

    @Test
    void testAnswerTruePercentWithNull() {
        InvalidBinaryStringException e = assertThrows(InvalidBinaryStringException.class, () -> stat.answerTruePercent(null));
        assertEquals(NullPointerException.class, e.getCause().getClass());
        assertEquals("Binary string is null", e.getCause().getMessage());
    }
}
