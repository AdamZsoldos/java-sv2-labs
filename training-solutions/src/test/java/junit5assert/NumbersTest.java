package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {0, 2, 0, 4, 0};
        assertArrayEquals(expected, Numbers.getEvenNumbers(numbers));
    }
}
