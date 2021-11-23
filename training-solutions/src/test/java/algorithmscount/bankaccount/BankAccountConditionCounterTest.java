package algorithmscount.bankaccount;

import algorithmscount.height.Height;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testCountAccountsWithBalanceGreaterThan() {
        assertEquals(3, BankAccountConditionCounter.countAccountsWithBalanceGreaterThan(Arrays.asList(
                new BankAccount("John Doe", "000000", 10000),
                new BankAccount("Jane Doe", "111111", 9999),
                new BankAccount("Jill Doe", "222222", 10001),
                new BankAccount("Jack Doe", "333333", 0),
                new BankAccount("Joe Doe", "444444", -1),
                new BankAccount("Jen Doe", "555555", 1000000),
                new BankAccount("Jon Doe", "666666", 9000)
        ), 10000));
    }
}
