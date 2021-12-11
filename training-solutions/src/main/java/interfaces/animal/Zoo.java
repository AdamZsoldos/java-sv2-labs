package interfaces.animal;

import java.util.List;

public class Zoo {

    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int result = 0;
        for (Animal animal : animals) {
            result += animal.getNumberOfLegs();
        }
        return result;
    }
}
