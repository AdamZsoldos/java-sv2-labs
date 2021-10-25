package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private final String title;
    private final String description;
    private LocalDateTime startDateTime;
    private double duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void start() { startDateTime = LocalDateTime.now(); }
}
