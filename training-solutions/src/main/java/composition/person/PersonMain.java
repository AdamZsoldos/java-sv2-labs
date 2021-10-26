package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("John Doe", "454545AA", new Address("Hungary", "Budapest", "Jópélda st. 10.", "1550"));
        Address address = person.getAddress();

        System.out.println();
        System.out.println(person.getAddress().addressToString());
        System.out.println(person.personToString());

        person.moveTo(new Address("Spain", "Madrid", "Rosszpélda way 20.", "2660"));

        System.out.println();
        System.out.println(person);

        person.correctData("Jane Roe", "676767BB", address);

        System.out.println();
        System.out.println(person);

        person.getAddress().correctData("United Kingdom", "London", "30 Stillbad lane", "3770");

        System.out.println();
        System.out.println(person);
    }
}
