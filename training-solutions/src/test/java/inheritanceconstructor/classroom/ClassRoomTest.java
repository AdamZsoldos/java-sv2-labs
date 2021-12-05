package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    ClassRoom classRoom = new ClassRoom("1st floor", 20, Facility.COMPUTERS);

    @Test
    void testIsSuitable() {
        assertTrue(classRoom.isSuitable(new Course(1, Facility.COMPUTERS)));
        assertTrue(classRoom.isSuitable(new Course(20, Facility.COMPUTERS)));
    }

    @Test
    void testIsSuitableWithTooManyParticipants() {
        assertFalse(classRoom.isSuitable(new Course(21, Facility.COMPUTERS)));
    }

    @Test
    void testIsSuitableWithWrongFacility() {
        assertFalse(classRoom.isSuitable(new Course(1, Facility.CHALKBOARD)));
    }
}
