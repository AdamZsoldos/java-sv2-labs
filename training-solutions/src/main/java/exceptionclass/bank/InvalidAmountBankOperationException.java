package exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {

    public InvalidAmountBankOperationException(String accountNumber) {
        super(accountNumber);
    }
}
