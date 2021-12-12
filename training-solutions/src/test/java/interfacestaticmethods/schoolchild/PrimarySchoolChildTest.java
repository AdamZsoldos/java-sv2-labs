package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testOfLowerClass() {
        assertEquals(LowerClassSchoolChild.class, PrimarySchoolChild.of(6).getClass());
        assertEquals(LowerClassSchoolChild.class, PrimarySchoolChild.of(10).getClass());
    }

    @Test
    void testOfUpperClass() {
        assertEquals(UpperClassSchoolChild.class, PrimarySchoolChild.of(11).getClass());
        assertEquals(UpperClassSchoolChild.class, PrimarySchoolChild.of(14).getClass());
    }

    @Test
    void testOfOutsideRange() {
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(5));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(15));
        assertEquals("Age outside legal value range of 6..14.", e1.getMessage());
        assertEquals("Age outside legal value range of 6..14.", e2.getMessage());
    }
}
