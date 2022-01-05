package exceptionclass.bank;

public class Account {

    private final String accountNumber;
    private double balance;
    private double maxWithdraw;
    private static final double DEFAULT_MAX_WITHDRAW = 100_000;

    public Account(String accountNumber, double balance) {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxWithdraw = DEFAULT_MAX_WITHDRAW;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxWithdraw() {
        return maxWithdraw;
    }

    public void setMaxWithdraw(double maxWithdraw) {
        this.maxWithdraw = maxWithdraw;
    }

    public void deposit(double amount) {
        validateDepositAmount(amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdrawAmount(amount);
        balance -= amount;
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number is null");
        }
    }

    private void validateDepositAmount(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException(accountNumber);
        }
    }

    private void validateWithdrawAmount(double amount) {
        if (amount <= 0 || amount > maxWithdraw) {
            throw new InvalidAmountBankOperationException(accountNumber);
        }
        if (balance < amount) {
            throw new LowBalanceBankOperationException(accountNumber);
        }
    }
}
