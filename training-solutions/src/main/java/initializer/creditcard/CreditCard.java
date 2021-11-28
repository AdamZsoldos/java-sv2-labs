package initializer.creditcard;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final Currency DEFAULT_CURRENCY = Currency.HUF;
    private static final List<Rate> RATES;

    static {
        List<Rate> rates = new ArrayList<>();
        for (Currency currency : Currency.values()) {
            rates.add(new Rate(currency, switch (currency) {
                case HUF -> 1;
                case EUR -> 369.42;
                case CHF -> 353.35;
                case GBP -> 435.00;
                case USD -> 326.39;
            }));
        }
        RATES = rates;
    }

    private long balance;
    private final Currency currency;

    public CreditCard(long balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public CreditCard(long balance) {
        this(balance, DEFAULT_CURRENCY);
    }

    public long getBalance() {
        return balance;
    }

    public boolean charge(long amount, Currency currency) {
        long chargedAmount = Math.round(amount * getConversionFactor(currency));
        if (balance < chargedAmount) return false;
        balance -= chargedAmount;
        return true;
    }

    public boolean charge(long amount) {
        return charge(amount, currency);
    }

    private double getConversionFactor(Currency currency) {
        for (Rate rate : RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("Conversion rate not found!");
    }
}
