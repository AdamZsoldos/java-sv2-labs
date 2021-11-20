package introexceptionthrow.patient;

import introexceptionthrow.patient.Patient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    void testCreateNameBlank() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Patient(" \n", "000000000", 1900));
        assertEquals("Name blank!", e.getMessage());
    }

    @Test
    void testCreateSsnInvalid() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "999999999", 1900));
        assertEquals("Social security number invalid!", e.getMessage());
    }

    @Test
    void testCreateYearTooLow() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "000000000", 1899));
        assertEquals("Year of birth below minimum value of 1900!", e.getMessage());
    }

    @Test
    void testCreateYearTooHigh() {
        int max = LocalDate.now().getYear();
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "000000000", max + 1));
        assertEquals("Year of birth over maximum value of " + max + "!", e.getMessage());
    }

    @Test
    void testCreateYearMax() {
        int max = LocalDate.now().getYear();
        Patient patient = new Patient("John Doe", "000000000", max);
        assertEquals("John Doe", patient.getName());
        assertEquals("000000000", patient.getSocialSecurityNumber());
        assertEquals(max, patient.getYearOfBirth());
    }

    @Test
    void testCreateYearMin() {
        int min = 1900;
        Patient patient = new Patient("John Doe", "000000000", min);
        assertEquals("John Doe", patient.getName());
        assertEquals("000000000", patient.getSocialSecurityNumber());
        assertEquals(min, patient.getYearOfBirth());
    }
}
