package composition.person;

public class Address {

    private String country;
    private String city;
    private String streetAddress;
    private String zipCode;

    public Address(String country, String city, String streetAddress, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public String addressToString() {
        return toString();
    }

    public void correctData(String country, String city, String streetAddress, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }
}
