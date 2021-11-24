package algorithmsrecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetSum() {
        assertEquals(162, Numbers.getSum(new int[]{4, 5, 12, 140, 0, 1}));
    }
}
