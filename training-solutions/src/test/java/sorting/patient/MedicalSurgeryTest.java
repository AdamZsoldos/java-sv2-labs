package sorting.patient;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    MedicalSurgery medicalSurgery = new MedicalSurgery(List.of(
            new Patient("John Doe", "000000", LocalDateTime.of(2021, 1, 1, 10, 15)),
            new Patient("Jill Doe", "111111", LocalDateTime.of(2021, 1, 1, 8, 45)),
            new Patient("Jane Doe", "222222", LocalDateTime.of(2021, 1, 1, 11, 0))
    ));

    @Test
    void testGetAppointmentsInChronologicalOrder() {
        List<Patient> expected = List.of(
                medicalSurgery.getAppointments().get(1),
                medicalSurgery.getAppointments().get(0),
                medicalSurgery.getAppointments().get(2)
        );
        assertEquals(expected, medicalSurgery.getAppointmentsInChronologicalOrder());
    }
}
