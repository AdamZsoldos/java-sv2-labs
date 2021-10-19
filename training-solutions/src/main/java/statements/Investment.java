package statements;

public class Investment {

    private final double cost = 0.3;
    private final int fund;
    private final int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() { return fund; }

    public boolean isActive() { return active; }

    public double getYield(int days) {
        return fund * days / 365.25 * interestRate * 0.01;
    }

    public double close(int days) {
        double total = active ?  ((double) fund + getYield(days)) * (1.0 - cost * 0.01) : 0.0;
        active = false;
        return total;
    }
}
