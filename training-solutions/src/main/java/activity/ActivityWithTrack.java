package activity;

public class ActivityWithTrack implements Activity {

    private final Track track;
    private final ActivityType type;

    public ActivityWithTrack(Track track, ActivityType type) {
        this.track = track;
        this.type = type;
    }

    public Track getTrack() {
        return track;
    }

    @Override
    public ActivityType getType() {
        return type;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }
}
