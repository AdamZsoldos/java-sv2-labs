package collectionsiterator.homeschooling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling homeSchooling = new HomeSchooling();

    @BeforeEach
    void setUp() {
        homeSchooling.addNewLesson(new OnlineLesson("John Doe", "Mathematics", LocalDateTime.now()));
        homeSchooling.addNewLesson(new OnlineLesson("Jane Doe", "Literature", LocalDateTime.now().plusHours(1)));
        homeSchooling.addNewLesson(new OnlineLesson("John Doe", "Mathematics", LocalDateTime.now().plusHours(2)));
        homeSchooling.addNewLesson(new OnlineLesson("Jill Doe", "P.E.", LocalDateTime.now().plusHours(3)));
        homeSchooling.addNewLesson(new OnlineLesson("John Doe", "Mathematics", LocalDateTime.now().plusDays(1)));
        homeSchooling.addNewLesson(new OnlineLesson("Jill Doe", "P.E.", LocalDateTime.now().plusDays(1).plusHours(1)));
    }

    @Test
    void testAddNewLesson() {
        assertEquals(6, homeSchooling.getLessons().size());
        assertEquals("Mathematics", homeSchooling.getLessons().get(0).getCourseName());
        assertEquals("Jill Doe", homeSchooling.getLessons().get(5).getTutorName());
    }

    @Test
    void testAddNewLessonInOccupiedTimeSlot() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> homeSchooling.addNewLesson(new OnlineLesson("John Doe", "Mathematics", homeSchooling.getLessons().get(0).getStartTime())));
        assertEquals("Time slot occupied", e.getMessage());
    }

    @Test
    void testGetLessonsByTitle() {
        List<OnlineLesson> lessons = homeSchooling.getLessonsByTitle("Mathematics");
        assertEquals(3, lessons.size());
        assertEquals("Mathematics", lessons.get(0).getCourseName());
        assertEquals("John Doe", lessons.get(2).getTutorName());
    }

    @Test
    void testRemoveLesson() {
        homeSchooling.removeLesson(homeSchooling.getLessons().get(0).getStartTime());
        assertEquals(5, homeSchooling.getLessons().size());
        assertEquals("Literature", homeSchooling.getLessons().get(0).getCourseName());
    }
}
