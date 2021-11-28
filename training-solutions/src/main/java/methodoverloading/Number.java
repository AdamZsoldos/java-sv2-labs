package methodoverloading;

public enum Number {
    ONE(1), TWO(2), THREE(3);

    private int value;

    Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
