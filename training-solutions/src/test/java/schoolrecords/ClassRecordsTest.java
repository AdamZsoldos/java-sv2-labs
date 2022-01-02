package schoolrecords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ClassRecordsTest {

    ClassRecords classRecords1 = new ClassRecords("1A", new Random(10));
    ClassRecords classRecords2 = new ClassRecords("1B", new Random(20));
    Student student1 = new Student("John Doe");
    Student student2 = new Student("Jane Doe");
    Student student3 = new Student("Jill Doe");
    Subject subject1 = new Subject("Mathematics");
    Subject subject2 = new Subject("Literature");
    Subject subject3 = new Subject("P. E.");

    @BeforeEach
    void setUp() {
        classRecords1.addStudent(student1);
        classRecords1.addStudent(student2);
        Tutor tutor = new Tutor("Jack Doe", List.of(subject1, subject2));
        student1.grade(new Mark(MarkType.A, subject1, tutor));
        student1.grade(new Mark(MarkType.B, subject1, tutor));
        student1.grade(new Mark(MarkType.C, subject2, tutor));
        student2.grade(new Mark(MarkType.D, subject2, tutor));
    }

    @Test
    void testCreate() {
        assertEquals("1A", classRecords1.getClassName());
    }

    @Test
    void testCreateWithEmptyClassName() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> new ClassRecords(null, new Random(10)));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> new ClassRecords("", new Random(10)));
        assertEquals("Class name cannot be null or empty.", e1.getMessage());
        assertEquals("Class name cannot be null or empty.", e2.getMessage());
    }

    @Test
    void testAddStudent() {
        assertTrue(classRecords1.addStudent(student3));
        assertFalse(classRecords1.addStudent(student3));
    }

    @Test
    void testRemoveStudent() {
        assertTrue(classRecords1.removeStudent(student1));
        assertFalse(classRecords1.removeStudent(student1));
    }

    @Test
    void testCalculateClassAverage() {
        assertEquals(3, classRecords1.calculateClassAverage());
    }

    @Test
    void testCalculateClassAverageWithZeroAverages() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> classRecords2.calculateClassAverage());
        assertEquals("Cannot calculate class average from zero student averages.", e.getMessage());
    }

    @Test
    void testCalculateClassAverageBySubject() {
        assertEquals(4.5, classRecords1.calculateClassAverageBySubject(subject1));
    }

    @Test
    void testCalculateClassAverageBySubjectWithZeroAverages() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> classRecords1.calculateClassAverageBySubject(subject3));
        assertEquals("Cannot calculate class average from zero student averages.", e.getMessage());
    }

    @Test
    void testFindStudentByName() {
        assertSame(student1, classRecords1.findStudentByName("John Doe"));
    }

    @Test
    void testFindNonexistentStudentByName() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> classRecords1.findStudentByName("Jill Doe"));
        assertEquals("Student not found.", e.getMessage());
    }

    @Test
    void testSelectRandomStudent() {
        assertSame(student2, classRecords1.selectRandomStudent());
        assertSame(student1, classRecords1.selectRandomStudent());
        assertSame(student1, classRecords1.selectRandomStudent());
        assertSame(student1, classRecords1.selectRandomStudent());
        assertSame(student1, classRecords1.selectRandomStudent());
        assertSame(student2, classRecords1.selectRandomStudent());
        assertSame(student1, classRecords1.selectRandomStudent());
    }

    @Test
    void testListStudyResults() {
        List<StudyResultByName> studyResults = classRecords1.listStudyResults();
        assertEquals(2, studyResults.size());
        assertEquals("John Doe", studyResults.get(0).getStudentName());
        assertEquals(4, studyResults.get(0).getGradeAverage());
        assertEquals("Jane Doe", studyResults.get(1).getStudentName());
        assertEquals(2, studyResults.get(1).getGradeAverage());
        studyResults = classRecords2.listStudyResults();
        assertEquals(0, studyResults.size());
    }

    @Test
    void testListStudentNames() {
        assertEquals("John Doe, Jane Doe", classRecords1.listStudentNames());
        assertEquals("", classRecords2.listStudentNames());
    }
}
