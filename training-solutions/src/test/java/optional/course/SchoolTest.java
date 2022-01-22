package optional.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school = new School();

    @BeforeEach
    void setUp() {
        school.getCourses().add(new Course("Java SE", 2_500_000, Level.BEGINNER));
    }

    @Test
    void testGetCourseCheaperThan() {
        assertEquals(school.getCourses().get(0), school.getCourseCheaperThan(2_500_000));
    }

    @Test
    void testGetCourseCheaperThanNotFound() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> school.getCourseCheaperThan(2_499_999));
        assertEquals("Course not found", e.getMessage());
    }

    @Test
    void testGetPriceOfCourseByNameAndLevel() {
        assertEquals(2_500_000, school.getPriceOfCourseByNameAndLevel("Java SE", Level.BEGINNER));
    }

    @Test
    void testGetPriceOfCourseByNameAndLevelNotFound() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> school.getPriceOfCourseByNameAndLevel("Java SE_", Level.BEGINNER));
        assertEquals("Course not found", e.getMessage());
    }

    @Test
    void testGetNameOfCourseByLevel() {
        assertEquals("Java SE", school.getNameOfCourseByLevel(Level.BEGINNER));
    }

    @Test
    void testGetNameOfCourseByLevelNotFound() {
        assertEquals("Sorry, there is no course at this level.", school.getNameOfCourseByLevel(Level.ADVANCED));
    }
}
