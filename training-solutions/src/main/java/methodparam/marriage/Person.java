package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private final List<RegisterDate> registerDates = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        if (name != null) this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void addBirthDate(LocalDate date) {
        addRegisterDate(new RegisterDate("születés ideje", date));
    }

    public void addMarriageDate(LocalDate date) {
        addRegisterDate(new RegisterDate("házasságkötés ideje", date));
    }

    private void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}
