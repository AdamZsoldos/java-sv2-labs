package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats exam = new ExamStats(200);

    @Test
    void testGetNumberOfTopGrades() {
        assertEquals(3, exam.getNumberOfTopGrades(80, 190, 140, 160, 200, 159, 0));
    }

    @Test
    void testGetNumberOfTopGradesWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> exam.getNumberOfTopGrades(80));
        assertEquals("Results array must not be empty!", e.getMessage());
    }

    @Test
    void testHasAnyFailed() {
        assertFalse(exam.hasAnyFailed(50, 140, 172, 100, 190));
        assertTrue(exam.hasAnyFailed(51, 140, 172, 100, 190));
    }

    @Test
    void testHasAnyFailedWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> exam.hasAnyFailed(50));
        assertEquals("Results array must not be empty!", e.getMessage());
    }
}
