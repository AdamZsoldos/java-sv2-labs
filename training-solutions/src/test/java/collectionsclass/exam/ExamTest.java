package collectionsclass.exam;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    Exam exam = new Exam(List.of(
            new ExamResult("Jill", 45),
            new ExamResult("Jack", 37),
            new ExamResult("Jane", 67),
            new ExamResult("John", 62),
            new ExamResult("Jess", 16),
            new ExamResult("Jeff", 51)
    ));

    @Test
    void testGetNamesOfAdmittees() {
        assertEquals(List.of("Jane", "John", "Jeff", "Jill", "Jack", "Jess"), exam.getNamesOfAdmittees(6));
        assertEquals(List.of("Jane", "John", "Jeff", "Jill"), exam.getNamesOfAdmittees(4));
        assertEquals(List.of("Jane"), exam.getNamesOfAdmittees(1));
    }

    @Test
    void testGetNamesOfAdmitteesNotEnoughApplicants() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> exam.getNamesOfAdmittees(7));
        assertEquals("Not enough applicants", e.getMessage());
    }
}
