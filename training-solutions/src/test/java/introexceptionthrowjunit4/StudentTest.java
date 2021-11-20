package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StudentTest {

    private final Student student = new Student();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddGrade() {
        assertEquals(0, student.getGrades().size());
        student.addGrade(1);
        assertEquals(1, student.getGrades().size());
        student.addGrade(5);
        assertEquals(2, student.getGrades().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGradeTooLow() {
        student.addGrade(0);
    }

    @Test
    public void testAddGradeTooHigh() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Grade must be between 1 and 5!");
        student.addGrade(6);
    }

    @Test
    public void testAddGradeNegative() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> student.addGrade(-1));
        assertEquals("Grade must be between 1 and 5!", e.getMessage());
    }
}
