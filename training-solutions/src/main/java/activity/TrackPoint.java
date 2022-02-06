package activity;

public class TrackPoint {

    private static final int R = 6371;
    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint point) {
        double latDistance = Math.toRadians(point.coordinate.getLatitude() - coordinate.getLatitude());
        double lonDistance = Math.toRadians(point.coordinate.getLongitude() - coordinate.getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(coordinate.getLatitude())) * Math.cos(Math.toRadians(point.coordinate.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters
        double height = elevation - point.elevation;
        return Math.sqrt(Math.pow(distance, 2) + Math.pow(height, 2));
    }
}
