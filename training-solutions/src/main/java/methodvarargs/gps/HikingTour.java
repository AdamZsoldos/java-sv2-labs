package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    private final List<FieldPoint> fieldPoints = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPoints) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging cannot be null!");
        }
        for (FieldPoint fieldPoint: fieldPoints) {
            fieldPoint.setTimeLogged(timeOfLogging);
            this.fieldPoints.add(fieldPoint);
        }
    }
}
