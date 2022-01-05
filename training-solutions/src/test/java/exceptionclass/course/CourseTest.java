package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course = new Course("Java SE", new SimpleTime("15:30"));

    @Test
    void testCreate() {
        assertEquals("Java SE", course.getName());
        assertEquals(15, course.getStart().getHour());
        assertEquals(30, course.getStart().getMinute());
    }

    @Test
    void testTestToString() {
        assertEquals("15:30: Java SE", course.toString());
    }
}
