package interfacedefaultmethods.cloth;

public class TableCloth implements Square {

    private final double sideLength;

    public TableCloth(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}
