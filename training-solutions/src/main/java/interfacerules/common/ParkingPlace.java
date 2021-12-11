package interfacerules.common;

public class ParkingPlace implements HasWidth, HasLength {

    @Override
    public double getWidth() {
        return 2.2;
    }

    @Override
    public double getLength() {
        return 5;
    }
}
