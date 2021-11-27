package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Woman woman;
    Man man;

    @BeforeEach
    void setUp() {
        woman = new Woman("Szabó Janka");
        man = new Man("Kovács János");
        woman.addBirthDate(LocalDate.of(1980, 1, 1));
        man.addBirthDate(LocalDate.of(1981, 2, 2));
    }

    @Test
    void testGetMarried() {
        Marriage.getMarried(woman, MarriageNameConvention.NO_CHANGE, man, MarriageNameConvention.NO_CHANGE);
        assertEquals(2, woman.getRegisterDates().size());
        assertEquals(2, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(1).getDescription());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(1).getDescription());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(1).getDate());
        assertEquals("Szabó Janka", woman.getName());
        assertEquals("Kovács János", man.getName());
    }

    @Test
    void testGetMarriedBridalName() {
        Marriage.getMarried(woman, MarriageNameConvention.BRIDAL_NAME, man, null);
        assertEquals("Kovács Jánosné", woman.getName());
        assertEquals("Kovács János", man.getName());
    }

    @Test
    void testGetMarriedSemiBridalName() {
        Marriage.getMarried(woman, MarriageNameConvention.SEMI_BRIDAL_NAME, man, null);
        assertEquals("Kovácsné Szabó Janka", woman.getName());
        assertEquals("Kovács János", man.getName());
    }

    @Test
    void testGetMarriedHyphenName() {
        Marriage.getMarried(woman, MarriageNameConvention.HYPHEN_NAME, man, MarriageNameConvention.HYPHEN_NAME);
        assertEquals("Szabó-Kovács Janka", woman.getName());
        assertEquals("Kovács-Szabó János", man.getName());
    }
}
