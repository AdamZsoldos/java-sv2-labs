package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    @Test
    void testGetTodayReferringStudent() {
        ClassFiveA classFiveA = new ClassFiveA();
        assertEquals("John", classFiveA.getTodayReferringStudent(1));
        assertEquals("Jane", classFiveA.getTodayReferringStudent(2));
        assertEquals("Jill", classFiveA.getTodayReferringStudent(3));
        assertEquals("John", classFiveA.getTodayReferringStudent(Number.ONE));
        assertEquals("Jane", classFiveA.getTodayReferringStudent(Number.TWO));
        assertEquals("Jill", classFiveA.getTodayReferringStudent(Number.THREE));
        assertEquals("John", classFiveA.getTodayReferringStudent("one"));
        assertEquals("Jane", classFiveA.getTodayReferringStudent("TwO"));
        assertEquals("Jill", classFiveA.getTodayReferringStudent("THREE"));
    }
}
