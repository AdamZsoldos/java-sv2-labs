package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header {

    protected final String nameOfClient;
    protected final String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    @Override
    public String getNameOfClient() {
        return nameOfClient;
    }

    @Override
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    public String getHeader() {
        return String.format("Title: %s, client: %s, address: %s", title, nameOfClient, addressOfBuilding);
    }
}
