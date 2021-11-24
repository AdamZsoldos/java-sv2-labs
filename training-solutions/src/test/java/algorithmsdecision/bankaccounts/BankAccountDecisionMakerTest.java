package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void testContainsBalanceGreaterThan() {
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("John Doe", "111111", 200),
                new BankAccount("Jane Doe", "222222", 250),
                new BankAccount("Jack Doe", "333333", 140),
                new BankAccount("Jill Doe", "444444", 220)
        );
        assertTrue(BankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 250));
        assertFalse(BankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 251));
    }
}
