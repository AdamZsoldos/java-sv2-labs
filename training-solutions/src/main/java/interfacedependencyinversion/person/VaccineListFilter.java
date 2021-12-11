package interfacedependencyinversion.person;

import java.util.ArrayList;
import java.util.List;

public class VaccineListFilter {

    private VaccineListFilter() { throw new IllegalStateException("Utility class"); }

    public static List<Person> filterElderly(List<Person> registered) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : registered) {
            if (person.getAge() > 65) {
                filtered.add(person);
            }
        }
        return filtered;
    }

    public static List<Person> filterNotElderly(List<Person> registered) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : registered) {
            if (person.getAge() <= 65) {
                filtered.add(person);
            }
        }
        return filtered;
    }

    public static List<Person> filterPregnant(List<Person> registered) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : registered) {
            if (person.getPregnant() == Pregnancy.YES) {
                filtered.add(person);
            }
        }
        return filtered;
    }

    public static List<Person> filterChronic(List<Person> registered) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : registered) {
            if (person.getChronic() == ChronicDisease.YES) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}
