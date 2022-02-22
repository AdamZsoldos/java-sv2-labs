package activitytracker2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Activity {

    private final long id;
    private final LocalDateTime startTime;
    private final String desc;
    private final ActivityType type;
    private final List<TrackPoint> trackPoints;

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type) {
        this(id, startTime, desc, type, List.of());
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this(0, startTime, desc, type, trackPoints);
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this(0, startTime, desc, type, List.of());
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id && Objects.equals(startTime, activity.startTime) && Objects.equals(desc, activity.desc) && type == activity.type && Objects.equals(trackPoints, activity.trackPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, desc, type, trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                ", trackPoints=" + trackPoints +
                '}';
    }
}
