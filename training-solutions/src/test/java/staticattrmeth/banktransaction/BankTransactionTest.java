package staticattrmeth.banktransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    void testCreate() {
        assertEquals(0, BankTransaction.getSumOfTransactions());
        assertEquals(0, BankTransaction.getAverageOfTransactions());
        assertEquals(0, BankTransaction.getCurrentMinValue());
        assertEquals(0, BankTransaction.getCurrentMaxValue());
        assertEquals(1, new BankTransaction(1).getValue());
        assertEquals(1, BankTransaction.getSumOfTransactions());
        assertEquals(1, BankTransaction.getAverageOfTransactions());
        assertEquals(1, BankTransaction.getCurrentMinValue());
        assertEquals(1, BankTransaction.getCurrentMaxValue());
        assertEquals(10000000, new BankTransaction(10000000).getValue());
        assertEquals(10000001, BankTransaction.getSumOfTransactions());
        assertEquals(5000000, BankTransaction.getAverageOfTransactions());
        assertEquals(1, BankTransaction.getCurrentMinValue());
        assertEquals(10000000, BankTransaction.getCurrentMaxValue());
        BankTransaction.initTheDay();
    }

    @Test
    void testCreateValueBelowMinimum() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new BankTransaction(0));
        assertEquals("Transaction value must not be below minimum value of 1.", e.getMessage());
    }

    @Test
    void testCreateValueAboveMaximum() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new BankTransaction(10000001));
        assertEquals("Transaction value must not exceed maximum value of 10000000.", e.getMessage());
    }

    @Test
    void testInitTheDay() {
        new BankTransaction(5000);
        assertEquals(5000, BankTransaction.getSumOfTransactions());
        BankTransaction.initTheDay();
        assertEquals(0, BankTransaction.getSumOfTransactions());
    }
}
