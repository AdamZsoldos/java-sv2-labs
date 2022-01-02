package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private final int numericValue;
    private final String description;

    MarkType(int numericValue, String description) {
        this.numericValue = numericValue;
        this.description = description;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public String getDescription() {
        return description;
    }
}
