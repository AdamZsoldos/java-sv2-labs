package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    private BankAccountDecisionMaker() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean containsBalanceGreaterThan(List<BankAccount> accounts, int minBalance) {
        for (BankAccount account : accounts) {
            if (account.getBalance() >= minBalance) return true;
        }
        return false;
    }
}
