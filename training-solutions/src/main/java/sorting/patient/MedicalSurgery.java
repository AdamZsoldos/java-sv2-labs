package sorting.patient;

import java.util.ArrayList;
import java.util.List;

public class MedicalSurgery {

    private final List<Patient> appointments;

    public MedicalSurgery(List<Patient> appointments) {
        this.appointments = appointments;
    }

    public List<Patient> getAppointments() {
        return appointments;
    }

    public List<Patient> getAppointmentsInChronologicalOrder() {
        List<Patient> result = new ArrayList<>(List.copyOf(appointments));
        result.sort(new PatientComparator());
        return result;
    }
}
