package exceptionclass.bank;

import java.util.List;

public class Bank {

    private final List<Account> accounts;

    public Bank(List<Account> accounts) {
        validateAccounts(accounts);
        this.accounts = accounts;
    }

    public double getAccountBalance(String accountNumber) {
        Account account = selectAccountByAccountNumber(accountNumber);
        return account.getBalance();
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account account = selectAccountByAccountNumber(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = selectAccountByAccountNumber(accountNumber);
        account.withdraw(amount);
    }

    private void validateAccounts(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Accounts list is null");
        }
    }

    private Account selectAccountByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException(accountNumber);
    }
}
