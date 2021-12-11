package interfacedependencyinversion.person;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        vaccinationList.clear();
        List<Person> toBeAdded = new ArrayList<>(List.copyOf(registered));
        moveToVaccinationList(toBeAdded, VaccineListFilter.filterPregnant(toBeAdded));
        moveToVaccinationList(toBeAdded, VaccineListFilter.filterElderly(toBeAdded));
        vaccinationList.addAll(toBeAdded);
    }

    private void moveToVaccinationList(List<Person> toBeAdded, List<Person> filtered) {
        toBeAdded.removeAll(filtered);
        vaccinationList.addAll(filtered);
    }
}
