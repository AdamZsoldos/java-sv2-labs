package initializer.creditcard;

public class Rate {

    private final Currency currency;
    private final double conversionFactor;

    public Rate(Currency currency, double conversionFactor) {
        this.currency = currency;
        this.conversionFactor = conversionFactor;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
