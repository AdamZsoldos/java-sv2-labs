package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {

    private SalesAmountSumCalculator() {
        throw new IllegalStateException("Utility class");
    }

    public static int calculate(List<Salesperson> salespeople) {
        int sum = 0;
        for (Salesperson salesperson : salespeople) {
            sum += salesperson.getSalesAmount();
        }
        return sum;
    }
}
