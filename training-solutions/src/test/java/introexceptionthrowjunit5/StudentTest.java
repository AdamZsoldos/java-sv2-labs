package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void testAddGrade() {
        assertEquals(0, student.getGrades().size());
        student.addGrade(1);
        assertEquals(1, student.getGrades().size());
        student.addGrade(5);
        assertEquals(2, student.getGrades().size());
    }

    @Test
    void testAddGradeTooLow() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> student.addGrade(0));
        assertEquals("Grade must be between 1 and 5!", e.getMessage());
    }

    @Test
    void testAddGradeTooHigh() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> student.addGrade(6));
        assertEquals("Grade must be between 1 and 5!", e.getMessage());
    }
}
