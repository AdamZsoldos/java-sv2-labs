package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    private BankAccountConditionCounter() {
        throw new IllegalStateException("Utility class");
    }

    public static int countAccountsWithBalanceGreaterThan(List<BankAccount> bankAccounts, int minBalance) {
        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() >= minBalance) count++;
        }
        return count;
    }
}
