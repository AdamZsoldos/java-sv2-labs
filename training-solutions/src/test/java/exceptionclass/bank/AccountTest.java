package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account("000000", 150_000);

    @Test
    void testCreate() {
        assertEquals("000000", account.getAccountNumber());
        assertEquals(150_000, account.getBalance());
        assertEquals(100_000, account.getMaxWithdraw());
    }

    @Test
    void testCreateWithNullAccountNumber() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Account(null, 150_000));
        assertEquals("Account number is null", e.getMessage());
    }

    @Test
    void testSetMaxWithdraw() {
        account.setMaxWithdraw(200_000);
        assertEquals(200_000, account.getMaxWithdraw());
    }

    @Test
    void testDeposit() {
        account.deposit(20_000);
        assertEquals(170_000, account.getBalance());
    }

    @Test
    void testDepositAmountTooLow() {
        InvalidAmountBankOperationException e = assertThrows(InvalidAmountBankOperationException.class, () -> account.deposit(0));
        assertEquals("000000", e.getAccountNumber());
    }

    @Test
    void testWithdraw() {
        account.withdraw(20_000);
        assertEquals(130_000, account.getBalance());
    }

    @Test
    void testWithdrawAmountTooLow() {
        InvalidAmountBankOperationException e = assertThrows(InvalidAmountBankOperationException.class, () -> account.withdraw(0));
        assertEquals("000000", e.getAccountNumber());
    }

    @Test
    void testWithdrawAmountTooHigh() {
        InvalidAmountBankOperationException e = assertThrows(InvalidAmountBankOperationException.class, () -> account.withdraw(100_001));
        assertEquals("000000", e.getAccountNumber());
        account.setMaxWithdraw(20_000);
        e = assertThrows(InvalidAmountBankOperationException.class, () -> account.withdraw(20_001));
        assertEquals("000000", e.getAccountNumber());
    }

    @Test
    void testWithdrawBalanceTooLow() {
        account.setMaxWithdraw(200_000);
        LowBalanceBankOperationException e = assertThrows(LowBalanceBankOperationException.class, () -> account.withdraw(150_001));
        assertEquals("000000", e.getAccountNumber());
    }
}
