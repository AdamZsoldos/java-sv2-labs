package collectionsclass.lottery;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testDraw() {
        assertEquals(List.of(52, 39, 80, 70, 16), Lottery.draw(5, 80, new Random(10)));
        assertEquals(List.of(17, 37, 36, 71, 54), Lottery.draw(5, 80, new Random(20)));
        assertEquals(List.of(40, 13, 67, 68, 5), Lottery.draw(5, 80, new Random(30)));
    }
}
