package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Jasper", 4, "white"));
        dogs.add(new Dog("Rex", 6, "brown"));
        dogs.add(new Dog("Chip", 3, "black"));

        System.out.println(dogs);

        Dog dog1 = dogs.get(1);
        dog1.setColor("red");

        System.out.println(dogs);

        Dog dog2 = new Dog("Rudy", 5, "brown");
        System.out.println(dog2);

        dog2 = dogs.get(1);
        System.out.println(dog2);

        dogs.add(dog2);

        Dog dog3 = dog1;
        dog3.setColor("blue");

        System.out.println(dogs);

        List<Dog> dogsCopy = dogs;

        Dog dog4 = dog1;
        dog4.setColor("yellow");

        System.out.println(dogsCopy);

        dog1.setColor("purple");

        System.out.println(dogsCopy);

        dog1 = null;

        System.out.println(dogsCopy);

        Dog dog5 = dogs.get(1);
        dog5 = null;

        System.out.println(dogsCopy);

        Dog ultimateDog = dogs.get(1);
        ultimateDog.setColor("neon green");

        System.out.println(dogsCopy);
    }
}
