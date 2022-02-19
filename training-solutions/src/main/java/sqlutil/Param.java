package sqlutil;

@SuppressWarnings("java:S6206")
public class Param {

    private final int index;
    private final Object value;

    public static Param of(int index, Object value) {
        return new Param(index, value);
    }

    private Param(int index, Object value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public Object getValue() {
        return value;
    }
}
