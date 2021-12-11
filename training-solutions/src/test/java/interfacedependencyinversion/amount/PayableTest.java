package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testGetPayableAmount() {
        Payable amount = new Amount();
        assertEquals(1111, amount.getPayableAmount(1111));
        assertEquals(-999, amount.getPayableAmount(-999));
    }

    @Test
    void testGetPayableCashAmount() {
        Payable cash = new Cash();
        assertEquals(1110, cash.getPayableAmount(1111));
        assertEquals(1110, cash.getPayableAmount(1112));
        assertEquals(1115, cash.getPayableAmount(1113));
        assertEquals(1115, cash.getPayableAmount(1114));
        assertEquals(1115, cash.getPayableAmount(1115));
        assertEquals(1115, cash.getPayableAmount(1116));
        assertEquals(1115, cash.getPayableAmount(1117));
        assertEquals(1120, cash.getPayableAmount(1118));
        assertEquals(1120, cash.getPayableAmount(1119));
        assertEquals(1120, cash.getPayableAmount(1120));
    }

    @Test
    void testGetPayableBankAtmAmount() {
        Payable bankAtm = new BankAtm();
        assertEquals(1000, bankAtm.getPayableAmount(1111));
        assertEquals(-1000, bankAtm.getPayableAmount(-501));
        assertEquals(-1000, bankAtm.getPayableAmount(-1500));
    }
}
