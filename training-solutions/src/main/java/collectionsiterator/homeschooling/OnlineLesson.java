package collectionsiterator.homeschooling;

import java.time.LocalDateTime;

public class OnlineLesson {

    private final String tutorName;
    private final String courseName;
    private final LocalDateTime startTime;

    public OnlineLesson(String tutorName, String courseName, LocalDateTime startTime) {
        this.tutorName = tutorName;
        this.courseName = courseName;
        this.startTime = startTime;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
