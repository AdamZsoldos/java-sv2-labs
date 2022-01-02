package schoolrecords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyResultByNameTest {

    @Test
    void testCreate() {
        StudyResultByName studyResultByName = new StudyResultByName("John Doe", 4.5);
        assertEquals("John Doe", studyResultByName.getStudentName());
        assertEquals(4.5, studyResultByName.getGradeAverage());
    }

    @Test
    void testCreateWithEmptyStudentName() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new StudyResultByName(null, 4.5));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new StudyResultByName("", 4.5));
        assertEquals("Student name cannot be null or empty.", e1.getMessage());
        assertEquals("Student name cannot be null or empty.", e2.getMessage());
    }
}
