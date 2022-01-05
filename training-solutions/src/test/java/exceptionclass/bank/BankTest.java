package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank;

    @BeforeEach
    void setUp() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("000000", 50_000));
        accounts.add(new Account("111111", 100_000));
        accounts.add(new Account("222222", 150_000));
        bank = new Bank(accounts);
    }

    @Test
    void testCreate() {
        assertEquals(50_000, bank.getAccountBalance("000000"));
        assertEquals(100_000, bank.getAccountBalance("111111"));
        assertEquals(150_000, bank.getAccountBalance("222222"));
    }

    @Test
    void testCrateWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Bank(null));
        assertEquals("Accounts list is null", e.getMessage());
    }

    @Test
    void testDepositToAccount() {
        bank.depositToAccount("222222", 20_000);
        assertEquals(170_000, bank.getAccountBalance("222222"));
    }

    @Test
    void testWithdrawFromAccount() {
        bank.withdrawFromAccount("111111", 20_000);
        assertEquals(80_000, bank.getAccountBalance("111111"));
    }

    @Test
    void testGetInvalidAccountBalance() {
        InvalidAccountNumberBankOperationException e = assertThrows(InvalidAccountNumberBankOperationException.class, () -> bank.getAccountBalance("000001"));
        assertEquals("000001", e.getAccountNumber());
    }

    @Test
    void testDepositToInvalidAccount() {
        InvalidAccountNumberBankOperationException e = assertThrows(InvalidAccountNumberBankOperationException.class, () -> bank.depositToAccount("000001", 20_000));
        assertEquals("000001", e.getAccountNumber());
    }

    @Test
    void testWithdrawFromInvalidAccount() {
        InvalidAccountNumberBankOperationException e = assertThrows(InvalidAccountNumberBankOperationException.class, () -> bank.withdrawFromAccount("000001", 20_000));
        assertEquals("000001", e.getAccountNumber());
    }
}
