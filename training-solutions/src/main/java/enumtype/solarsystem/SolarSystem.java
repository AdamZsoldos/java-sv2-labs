package enumtype.solarsystem;

public enum SolarSystem {
    MERCURY(0, 0),
    VENUS(0, 0),
    EARTH(1, 0),
    MARS(2, 0),
    JUPITER(53, 26),
    SATURN(53, 29),
    URANUS(27, 0),
    NEPTUNE(14, 0);

    private int numConfirmedMoons;
    private int numProvisionalMoons;

    SolarSystem(int numSatellites, int numProvisionalMoons) {
        this.numConfirmedMoons = numSatellites;
        this.numProvisionalMoons = numProvisionalMoons;
    }

    public int getNumConfirmedMoons() {
        return numConfirmedMoons;
    }

    public int getNumProvisionalMoons() {
        return numProvisionalMoons;
    }

    public int getNumMoons() {
        return numConfirmedMoons + numProvisionalMoons;
    }
}
