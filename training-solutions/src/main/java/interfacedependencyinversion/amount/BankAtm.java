package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return (int) (Math.round(amount * 0.001) * 1000);
    }
}
