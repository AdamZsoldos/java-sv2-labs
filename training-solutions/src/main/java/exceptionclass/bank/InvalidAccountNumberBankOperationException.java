package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    public InvalidAccountNumberBankOperationException(String accountNumber) {
        super(accountNumber);
    }
}
