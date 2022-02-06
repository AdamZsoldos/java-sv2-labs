package activity;

public final class Coordinate {

    private static final double MIN_LATITUDE = -90;
    private static final double MAX_LATITUDE = 90;
    private static final double MIN_LONGITUDE = -180;
    private static final double MAX_LONGITUDE = 180;
    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        validateCoordinate(latitude, longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void validateCoordinate(double latitude, double longitude) {
        if (latitude < MIN_LATITUDE || latitude > MAX_LATITUDE) {
            throw new IllegalArgumentException(String.format("Latitude outside of legal range of %.1f..%.1f", MIN_LATITUDE, MAX_LATITUDE));
        }
        if (longitude < MIN_LONGITUDE || longitude > MAX_LONGITUDE) {
            throw new IllegalArgumentException(String.format("Longitude outside of legal range of %.1f..%.1f", MIN_LONGITUDE, MAX_LONGITUDE));
        }
    }
}
