package schoolrecords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void testCreate() {
        Subject subject = new Subject("Mathematics");
        assertEquals("Mathematics", subject.getSubjectName());
    }

    @Test
    void testCreateWithEmptyName() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new Subject(null));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new Subject(""));
        assertEquals("Subject name cannot be null or empty.", e1.getMessage());
        assertEquals("Subject name cannot be null or empty.", e2.getMessage());
    }
}
