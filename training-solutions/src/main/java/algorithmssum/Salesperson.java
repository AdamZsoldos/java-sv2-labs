package algorithmssum;

public class Salesperson {

    private final String name;
    private final int salesAmount;

    public Salesperson(String name, int salesAmount) {
        this.name = name;
        this.salesAmount = salesAmount;
    }

    public String getName() {
        return name;
    }

    public int getSalesAmount() {
        return salesAmount;
    }
}
