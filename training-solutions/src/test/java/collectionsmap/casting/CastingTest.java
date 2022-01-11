package collectionsmap.casting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    Casting casting = new Casting();
    Map<Integer, String> applicants = new HashMap<>();

    @BeforeEach
    void setUp() {
        applicants.put(77, "Jill");
        applicants.put(105, "John");
        applicants.put(19, "Jane");
        applicants.put(45, "Josh");
        applicants.put(82, "Jess");
    }

    @Test
    void testCallNextApplicant() {
        assertEquals("Josh", casting.callNextApplicant(40, applicants));
        assertEquals("John", casting.callNextApplicant(104, applicants));
    }

    @Test
    void testCallNextApplicantNoMoreApplicants() {
        assertThrows(IllegalStateException.class, () -> casting.callNextApplicant(105, applicants), "No more applicants");
    }
}
