package methodvarargs.gps;

import java.time.LocalDateTime;

public class FieldPoint {

    private final LocalDateTime timeSet;
    private LocalDateTime timeLogged;
    private final double latitude;
    private final double longitude;

    public FieldPoint(LocalDateTime timeSet, double latitude, double longitude) {
        this.timeSet = timeSet;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocalDateTime getTimeSet() {
        return timeSet;
    }

    public LocalDateTime getTimeLogged() {
        return timeLogged;
    }

    public void setTimeLogged(LocalDateTime timeLogged) {
        this.timeLogged = timeLogged;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
