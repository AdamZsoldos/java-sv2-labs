package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void testSumAmountOfCreditEntries() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("000", TransactionOperation.CREDIT, 20000),
                new Transaction("000", TransactionOperation.DEBIT, 100000),
                new Transaction("111", TransactionOperation.CREDIT, 32000),
                new Transaction("111", TransactionOperation.DEBIT, 160000),
                new Transaction("222", TransactionOperation.CREDIT, 300)
        );
        assertEquals(52300, TransactionSumCalculator.sumAmountOfCreditEntries(transactions));
    }
}
