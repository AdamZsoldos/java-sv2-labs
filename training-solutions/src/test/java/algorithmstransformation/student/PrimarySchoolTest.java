package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    @Test
    void testGetStudents() {
        PrimarySchool school = new PrimarySchool(Arrays.asList(
                new Person("John Doe", 40, "1200 Example way", false),
                new Person("Jane Doe", 16, "1300 Example way", true),
                new Person("Jack Doe", 17, "1400 Example way", true),
                new Person("Jill Doe", 42, "1500 Example way", false),
                new Person("Jenn Doe", 12, "1600 Example way", true),
                new Person("Jeff Doe", 50, "1700 Example way", false)
        ));
        List<Student> students = school.getStudents();
        assertEquals(3, students.size());
        assertEquals("Jane Doe", students.get(0).getName());
        assertEquals("Jack Doe", students.get(1).getName());
        assertEquals("Jenn Doe", students.get(2).getName());
    }
}
