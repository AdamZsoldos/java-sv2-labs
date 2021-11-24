package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    private TransactionCounter() {
        throw new IllegalStateException("Utility class");
    }

    public static int countCreditTransactionsWithAmountLessThan(List<Transaction> transactions, int maxAmount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionType() == TransactionType.CREDIT && transaction.getAmount() <= maxAmount) {
                count++;
            }
        }
        return count;
    }
}
