package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 28);
        Person person2 = person1;

        System.out.println("person1 -> " + person1);
        System.out.println("person2 -> " + person2);

        person2.setName("Jane Doe");
        person2.setAge(person2.getAge() + 8);

        System.out.println("person1 -> " + person1);
        System.out.println("person2 -> " + person2);

        int int1 = 24;
        int int2 = int1;

        System.out.println("int1 -> " + int1);
        System.out.println("int2 -> " + int2);

        int2++;

        System.out.println("int1 -> " + int1);
        System.out.println("int2 -> " + int2);

        person1 = new Person("Jack Doe", 40);

        System.out.println("person1 -> " + person1);
        System.out.println("person2 -> " + person2);
    }
}
