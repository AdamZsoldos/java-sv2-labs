package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void testAddDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("Jasper", 4, Breed.GERMAN_SHEPHERD));
        vet.addDog(new Dog("Charlie", 2, Breed.BEAGLE));
        vet.addDog(new Dog("Bailey", 6, Breed.MIXTURE));
        assertEquals(3, vet.getDogs().size());
        assertEquals(1, vet.getDogs().get(0).getCode());
        assertEquals(2, vet.getDogs().get(1).getCode());
        assertEquals(3, vet.getDogs().get(2).getCode());
    }
}
