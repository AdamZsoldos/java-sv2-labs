package dynamictypes.publictransport;

public class Underground extends PublicVehicle {

    private final int numberOfStations;

    public Underground(int lineNumber, double length, int numberOfStations) {
        super(lineNumber, length);
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}
