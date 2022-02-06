package activity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Activities {

    private final List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public long numberOfTrackActivities() {
        return activities.stream().filter(ActivityWithTrack.class::isInstance).count();
    }

    public long numberOfWithoutTrackActivities() {
        return activities.stream().filter(ActivityWithoutTrack.class::isInstance).count();
    }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Double> result = new LinkedHashMap<>();
        for (ActivityType activityType : ActivityType.values()) {
            result.put(activityType, 0.0);
        }
        for (Activity activity : activities) {
            result.put(activity.getType(), result.get(activity.getType()) + activity.getDistance());
        }
        return result.entrySet().stream()
                .map(entry -> new Report(entry.getKey(), entry.getValue()))
                .toList();
    }
}
