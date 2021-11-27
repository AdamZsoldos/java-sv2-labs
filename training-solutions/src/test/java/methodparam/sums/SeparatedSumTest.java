package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testSumFromFile() {
        Sum sum = SeparatedSum.sumFromFile(Path.of("src/test/resources/floatingnumbers.txt"));
        assertEquals(-153.3, sum.getNegativeSum(), 0.05);
        assertEquals(110.6, sum.getPositiveSum(), 0.05);
    }
}
