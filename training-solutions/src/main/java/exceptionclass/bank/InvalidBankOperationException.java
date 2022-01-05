package exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException {

    private final String accountNumber;

    public InvalidBankOperationException(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
