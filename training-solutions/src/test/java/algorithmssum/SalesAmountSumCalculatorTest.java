package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void testCalculate() {
        List<Salesperson> salespeople = Arrays.asList(
                new Salesperson("John Doe", 20000),
                new Salesperson("Jane Doe", 32000),
                new Salesperson("Jill Doe", 300)
        );
        assertEquals(52300, SalesAmountSumCalculator.calculate(salespeople));
    }
}
