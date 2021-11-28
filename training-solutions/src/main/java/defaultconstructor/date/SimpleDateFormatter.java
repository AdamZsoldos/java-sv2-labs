package defaultconstructor.date;

public class SimpleDateFormatter {

    private static final String DATE_FORMAT = "%d-%d-%d";
    private CountryCode defaultCountryCode;

    public SimpleDateFormatter() {
        defaultCountryCode = CountryCode.HU;
    }

    public CountryCode getDefaultCountryCode() {
        return defaultCountryCode;
    }

    public void setDefaultCountryCode(CountryCode defaultCountryCode) {
        this.defaultCountryCode = defaultCountryCode;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateString(simpleDate, defaultCountryCode);
    }

    public String formatDateString(SimpleDate date, CountryCode countryCode) {
        return switch (countryCode) {
            case EN -> String.format(DATE_FORMAT, date.getDay(), date.getMonth(), date.getYear());
            case HU -> String.format(DATE_FORMAT, date.getYear(), date.getMonth(), date.getDay());
            default -> String.format(DATE_FORMAT, date.getMonth(), date.getDay(), date.getYear());
        };
    }
}
