package exceptionclass.bank;

public class LowBalanceBankOperationException extends InvalidBankOperationException {

    public LowBalanceBankOperationException(String accountNumber) {
        super(accountNumber);
    }
}
