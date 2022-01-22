package optional.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class School {

    private final List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public Course getCourseCheaperThan(int maxPrice) {
        Optional<Course> result = Optional.empty();
        for (Course course : courses) {
            if (course.getPrice() <= maxPrice) {
                result = Optional.of(course);
                break;
            }
        }
        return result.orElseThrow(() -> new IllegalArgumentException("Course not found"));
    }

    public int getPriceOfCourseByNameAndLevel(String name, Level level) {
        Optional<Integer> result = Optional.empty();
        for (Course course : courses) {
            if (course.getName().equals(name) && course.getLevel() == level) {
                result = Optional.of(course.getPrice());
                break;
            }
        }
        return result.orElseThrow(() -> new IllegalArgumentException("Course not found"));
    }

    public String getNameOfCourseByLevel(Level level) {
        Optional<String> result = Optional.empty();
        for (Course course : courses) {
            if (course.getLevel() == level) {
                result = Optional.of(course.getName());
                break;
            }
        }
        return result.orElse("Sorry, there is no course at this level.");
    }
}
