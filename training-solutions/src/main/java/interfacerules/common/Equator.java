package interfacerules.common;

public class Equator implements HasName, HasLength {

    private static final String NAME = "Equator";
    private static final double LENGTH = 40_075.017;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
