package interfacedependencyinversion.person;

public class Person {

    private final String name;
    private final int age;
    private final ChronicDisease chronic;
    private final Pregnancy pregnant;

    public Person(String name, int age, ChronicDisease chronic, Pregnancy pregnant) {
        this.name = name;
        this.age = age;
        this.chronic = chronic;
        this.pregnant = pregnant;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ChronicDisease getChronic() {
        return chronic;
    }

    public Pregnancy getPregnant() {
        return pregnant;
    }
}
