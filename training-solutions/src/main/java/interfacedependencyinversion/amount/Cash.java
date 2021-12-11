package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return (int) (Math.round(amount * 0.2) * 5);
    }
}
