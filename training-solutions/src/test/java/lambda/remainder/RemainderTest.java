package lambda.remainder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void testChangeNumbersToRemainders() {
        assertEquals(List.of(0, 1, 1, 0, 2, 0), Remainder.changeNumbersToRemainders(List.of(45, 13, 64, 51, 92, 33), 3));
    }
}
