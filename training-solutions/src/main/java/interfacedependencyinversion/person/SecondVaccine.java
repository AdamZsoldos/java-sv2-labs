package interfacedependencyinversion.person;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        vaccinationList.clear();
        List<Person> toBeAdded = new ArrayList<>(List.copyOf(registered));
        toBeAdded.removeAll(VaccineListFilter.filterPregnant(toBeAdded));
        toBeAdded.removeAll(VaccineListFilter.filterChronic(toBeAdded));
        moveToVaccinationList(toBeAdded, VaccineListFilter.filterNotElderly(toBeAdded));
        vaccinationList.addAll(toBeAdded);
    }

    private void moveToVaccinationList(List<Person> toBeAdded, List<Person> filtered) {
        toBeAdded.removeAll(filtered);
        vaccinationList.addAll(filtered);
    }
}
