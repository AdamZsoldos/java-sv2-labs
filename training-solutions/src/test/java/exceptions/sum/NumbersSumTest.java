package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumFromIntArray() {
        assertEquals(6, numbersSum.getSum(new int[]{1, 2, 3}));
    }

    @Test
    void testGetSumFromStringArray() {
        assertEquals(6, numbersSum.getSum(new String[]{"1", "2", "3"}));
    }

    @Test
    void testGetSumFromEmptyIntArray() {
        assertEquals(0, numbersSum.getSum(new int[0]));
    }

    @Test
    void testGetSumFromNonnumericStringArray() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(new String[]{"1", "", "3"}));
        assertEquals("Array contains nonnumeric strings.", e.getMessage());
    }

    @Test
    void testGetSumWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum((int[]) null));
        assertEquals("Numbers array is null.", e.getMessage());
    }
}
