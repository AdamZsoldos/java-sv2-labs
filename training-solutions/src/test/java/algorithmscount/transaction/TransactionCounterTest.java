package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCountCreditTransactionsWithAmountLessThan() {
        assertEquals(3, TransactionCounter.countCreditTransactionsWithAmountLessThan(Arrays.asList(
                new Transaction("000000", TransactionType.CREDIT, 10000),
                new Transaction("111111", TransactionType.DEBIT, 9999),
                new Transaction("222222", TransactionType.CREDIT, 10001),
                new Transaction("333333", TransactionType.CREDIT, 0),
                new Transaction("444444", TransactionType.DEBIT, -1),
                new Transaction("555555", TransactionType.DEBIT, 1000000),
                new Transaction("666666", TransactionType.CREDIT, 9000),
                new Transaction("777777", TransactionType.CREDIT, 1000000)
        ), 10000));
    }
}
