package staticattrmeth.vet;

public class Dog {

    private final String name;
    private final int age;
    private final Breed breed;
    private long code;

    public Dog(String name, int age, Breed species) {
        this.name = name;
        this.age = age;
        this.breed = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
