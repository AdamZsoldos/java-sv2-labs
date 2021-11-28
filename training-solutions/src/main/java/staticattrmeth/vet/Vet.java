package staticattrmeth.vet;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private final List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
        dog.setCode(code++);
    }
}
