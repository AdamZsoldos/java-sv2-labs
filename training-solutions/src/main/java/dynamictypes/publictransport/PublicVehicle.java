package dynamictypes.publictransport;

public class PublicVehicle {

    private final int lineNumber;
    private final double length;

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLength() {
        return length;
    }
}
