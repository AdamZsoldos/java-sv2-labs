package methodparam.sums;

public class Sum {

    private final double negativeSum;
    private final double positiveSum;

    public Sum(double negativeSum, double positiveSum) {
        this.negativeSum = negativeSum;
        this.positiveSum = positiveSum;
    }

    public double getNegativeSum() {
        return negativeSum;
    }

    public double getPositiveSum() {
        return positiveSum;
    }
}
