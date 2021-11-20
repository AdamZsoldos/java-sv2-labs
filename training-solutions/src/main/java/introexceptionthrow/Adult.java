package introexceptionthrow;

public class Adult {

    private final String name;
    private final int age;

    public Adult(String name, int age) {
        if (age < 18) {
            throw new IllegalStateException("Age must be 18+!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
