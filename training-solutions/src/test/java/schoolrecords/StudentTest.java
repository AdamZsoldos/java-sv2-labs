package schoolrecords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    Subject subject1;
    Subject subject2;
    Subject subject3;
    Tutor tutor;

    @BeforeEach
    void setUp() {
        student = new Student("John Doe");
        subject1 = new Subject("Mathematics");
        subject2 = new Subject("Literature");
        subject3 = new Subject("P. E.");
        tutor = new Tutor("Jane Doe", List.of(subject1, subject2));
        student.grade(new Mark(MarkType.A, subject1, tutor));
        student.grade(new Mark(MarkType.B, subject1, tutor));
        student.grade(new Mark(MarkType.C, subject2, tutor));
    }

    @Test
    void testCreate() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    void testCreateWithEmptyName() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new Student(null));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new Student(""));
        assertEquals("Name cannot be null or empty.", e1.getMessage());
        assertEquals("Name cannot be null or empty.", e2.getMessage());
    }

    @Test
    void testGradeWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> student.grade(null));
        assertEquals("Mark cannot be null.", e.getMessage());
    }

    @Test
    void testCalculateAverage() {
        assertEquals(4, student.calculateAverage());
    }

    @Test
    void testCalculateAverageWithNoMarks() {
        Student student = new Student("John Doe");
        ArithmeticException e = assertThrows(ArithmeticException.class, student::calculateAverage);
        assertEquals("Cannot calculate average from zero grade marks.", e.getMessage());
    }

    @Test
    void testCalculateSubjectAverage() {
        assertEquals(4.5, student.calculateSubjectAverage(subject1));
        assertEquals(3, student.calculateSubjectAverage(subject2));
    }

    @Test
    void testCalculateSubjectAverageWithNoMarks() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> student.calculateSubjectAverage(subject3));
        assertEquals("Cannot calculate average from zero grade marks.", e.getMessage());
    }

    @Test
    void testTestToString() {
        assertEquals("Student{name='John Doe', marks=[Mark{markType=A, subject=Mathematics, tutor=Jane Doe}, Mark{markType=B, subject=Mathematics, tutor=Jane Doe}, Mark{markType=C, subject=Literature, tutor=Jane Doe}]}", student.toString());
    }
}
