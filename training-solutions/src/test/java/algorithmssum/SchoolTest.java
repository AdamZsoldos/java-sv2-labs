package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        School school = new School();
        assertEquals(48, school.getNumberOfStudents(Arrays.asList(8, 5, 12, 7, 16)));
        assertEquals(20, school.getNumberOfStudents(Arrays.asList(0, 10, 1, 9)));
        assertEquals(0, school.getNumberOfStudents(List.of()));
    }
}
