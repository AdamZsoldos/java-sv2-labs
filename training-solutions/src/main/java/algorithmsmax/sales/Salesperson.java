package algorithmsmax.sales;

public class Salesperson {

    private final String name;
    private final int amount;
    private final int target;

    public Salesperson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }

    public int getAmountOverTarget() {
        return amount - target;
    }
}
