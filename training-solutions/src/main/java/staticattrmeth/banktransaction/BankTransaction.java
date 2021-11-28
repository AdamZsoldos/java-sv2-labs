package staticattrmeth.banktransaction;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private final long value;

    public BankTransaction(long value) {
        validateValue(value);
        this.value = value;
        countOfTransactions++;
        sumOfTransactions += value;
        if (currentMinValue == 0 || value < currentMinValue) currentMinValue = value;
        if (currentMaxValue == 0 || value > currentMaxValue) currentMaxValue = value;
    }

    public long getValue() {
        return value;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    public static long getAverageOfTransactions() {
        if (countOfTransactions == 0) return 0;
        return sumOfTransactions / countOfTransactions;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    private void validateValue(long value) {
        if (value < MIN_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction value must not be below minimum value of " + MIN_TRANSACTION_VALUE + ".");
        } else if (value > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction value must not exceed maximum value of " + MAX_TRANSACTION_VALUE + ".");
        }
    }
}
