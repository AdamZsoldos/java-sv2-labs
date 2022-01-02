package schoolrecords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TutorTest {

    Subject subject1 = new Subject("Mathematics");
    Subject subject2 = new Subject("Literature");
    Tutor tutor = new Tutor("John Doe", List.of(subject1));

    @Test
    void testCreate() {
        assertEquals("John Doe", tutor.getName());
    }

    @Test
    void testIsTeachingSubject() {
        assertTrue(tutor.isTeachingSubject(subject1));
        assertFalse(tutor.isTeachingSubject(subject2));
    }

    @Test
    void testCreateWithEmptyName() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new Tutor(null, List.of(subject1)));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new Tutor("", List.of(subject1)));
        assertEquals("Name cannot be null or empty.", e1.getMessage());
        assertEquals("Name cannot be null or empty.", e2.getMessage());
    }

    @Test
    void testCreateWithEmptyTaughtSubjects() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new Tutor("John Doe", null));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new Tutor("John Doe", List.of()));
        assertEquals("Taught subjects cannot be null or empty.", e1.getMessage());
        assertEquals("Taught subjects cannot be null or empty.", e2.getMessage());
    }
}
