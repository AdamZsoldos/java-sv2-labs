package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {

    private TransactionSumCalculator() {
        throw new IllegalStateException("Utility class");
    }

    public static int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionOperation() == TransactionOperation.CREDIT) {
                sum += transaction.getAmount();
            }
        }
        return sum;
    }
}
