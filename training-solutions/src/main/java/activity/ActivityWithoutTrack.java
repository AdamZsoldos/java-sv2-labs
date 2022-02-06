package activity;

public class ActivityWithoutTrack implements Activity {

    private final ActivityType type;

    public ActivityWithoutTrack(ActivityType type) {
        this.type = type;
    }

    @Override
    public ActivityType getType() {
        return type;
    }

    @Override
    public double getDistance() {
        return 0;
    }
}
