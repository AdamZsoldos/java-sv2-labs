package composition.person;

public class Person {

    private String name;
    private String identificationNumber;
    private Address address;

    public Person(String name, String identificationNumber, Address address) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", address=" + address +
                '}';
    }

    public String personToString() {
        return toString();
    }

    public void correctData(String name, String identificationNumber, Address address) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.address = address;
    }

    public void moveTo(Address address) {
        this.address = address;
    }
}
