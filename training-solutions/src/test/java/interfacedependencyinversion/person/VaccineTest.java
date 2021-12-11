package interfacedependencyinversion.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine vaccine;
    List<Person> registered;

    @BeforeEach
    void setUp() {
        registered = new ArrayList<>();
        registered.add(new Person("John Doe", 65, ChronicDisease.NO, Pregnancy.NO));
        registered.add(new Person("Jane Doe", 66, ChronicDisease.NO, Pregnancy.NO));
        registered.add(new Person("Jack Doe", 45, ChronicDisease.YES, Pregnancy.NO));
        registered.add(new Person("Jill Doe", 52, ChronicDisease.NO, Pregnancy.YES));
        registered.add(new Person("Jeff Doe", 36, ChronicDisease.NO, Pregnancy.NO));
    }

    @Test
    void testGenerateFirstVaccinationList() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registered);
        assertEquals(5, vaccine.getVaccinationList().size());
        assertEquals("Jill Doe", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Jane Doe", vaccine.getVaccinationList().get(1).getName());
        assertEquals("John Doe", vaccine.getVaccinationList().get(2).getName());
        assertEquals("Jack Doe", vaccine.getVaccinationList().get(3).getName());
        assertEquals("Jeff Doe", vaccine.getVaccinationList().get(4).getName());
    }

    @Test
    void testGenerateSecondVaccinationList() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registered);
        assertEquals(3, vaccine.getVaccinationList().size());
        assertEquals("John Doe", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Jeff Doe", vaccine.getVaccinationList().get(1).getName());
        assertEquals("Jane Doe", vaccine.getVaccinationList().get(2).getName());
    }
}
