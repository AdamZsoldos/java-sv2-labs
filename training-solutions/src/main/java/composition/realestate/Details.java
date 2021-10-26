package composition.realestate;

public class Details {

    private String description;
    private Address address;
    private int squeareMeter;
    private int areaOfSite;

    public Details(String description, Address address, int squeareMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.squeareMeter = squeareMeter;
        this.areaOfSite = areaOfSite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSqueareMeter() {
        return squeareMeter;
    }

    public void setSqueareMeter(int squeareMeter) {
        this.squeareMeter = squeareMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }

    @Override
    public String toString() {
        return "Details{" +
                "description='" + description + '\'' +
                ", address=" + address +
                ", squeareMeter=" + squeareMeter +
                ", areaOfSite=" + areaOfSite +
                '}';
    }
}
