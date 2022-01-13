package sorting.patient;

import java.time.LocalDateTime;

public class Patient {

    private final String name;
    private final String ssn;
    private final LocalDateTime appointment;

    public Patient(String name, String ssn, LocalDateTime appointment) {
        this.name = name;
        this.ssn = ssn;
        this.appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }
}
