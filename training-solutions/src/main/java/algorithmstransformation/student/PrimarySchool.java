package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private final List<Person> frequenters;

    public PrimarySchool(List<Person> frequenters) {
        this.frequenters = frequenters;
    }

    public List<Person> getFrequenters() {
        return frequenters;
    }

    public void addFrequenter(Person person) {
        frequenters.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person person : frequenters) {
            if (person.isStudent()) {
                students.add(new Student(person.getName(), person.getAddress()));
            }
        }
        return students;
    }
}
