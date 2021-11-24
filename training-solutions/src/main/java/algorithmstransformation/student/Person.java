package algorithmstransformation.student;

public class Person {

    private final String name;
    private final int age;
    private final String address;
    private final boolean isStudent;

    public Person(String name, int age, String address, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean isStudent() {
        return isStudent;
    }
}
