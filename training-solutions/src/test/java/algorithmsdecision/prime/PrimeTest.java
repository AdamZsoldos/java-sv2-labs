package algorithmsdecision.prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        assertTrue(Prime.isPrime(17));
        assertFalse(Prime.isPrime(21));
    }
}
