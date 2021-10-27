package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public String getFormattedPersonList() {
        if (personList.isEmpty()) return "None\n";

        StringBuilder s = new StringBuilder();
        for (Person person: personList) {
            s.append(person).append("\n");
        }
        return s.toString();
    }
}
