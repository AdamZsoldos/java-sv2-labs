package collectionsiterator.homeschooling;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private final List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        validateLesson(lesson);
        lessons.add(lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson lesson = iterator.next();
            if (lesson.getCourseName().equals(title)) {
                result.add(lesson);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        lessons.remove(getLessonByStartTime(startTime));
    }

    private void validateLesson(OnlineLesson lesson) {
        if (getLessonByStartTime(lesson.getStartTime()) != null) {
            throw new IllegalArgumentException("Time slot occupied");
        }
    }

    private OnlineLesson getLessonByStartTime(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson lesson = iterator.next();
            if (lesson.getStartTime().isEqual(startTime)) {
                return lesson;
            }
        }
        return null;
    }
}
