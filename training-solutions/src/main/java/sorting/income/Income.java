package sorting.income;

import java.util.Arrays;

public class Income {

    private final int[] incomeValues;

    public Income(int[] incomeValues) {
        this.incomeValues = incomeValues;
    }

    public int[] getIncomeValues() {
        return incomeValues;
    }

    public int getHighestIncome() {
        Arrays.sort(incomeValues);
        return incomeValues[incomeValues.length - 1];
    }
}
