package constructoroverloading.advertisement;

import java.util.ArrayList;
import java.util.List;

public class BikeAdvertisement {

    private String description;
    private int price;
    private List<String> extras;
    private String manufacturer;
    private String serialNumber;

    public BikeAdvertisement(String description, int price) {
        this(description, price, new ArrayList<>());
    }

    public BikeAdvertisement(String description, int price, List<String> extras) {
        this(description, price, extras, "N/A");
    }

    public BikeAdvertisement(String description, int price, List<String> extras, String manufacturer) {
        this(description, price, extras, manufacturer, "N/A");
    }

    public BikeAdvertisement(String description, int price, List<String> extras, String manufacturer, String serialNumber) {
        this.description = description;
        this.price = price;
        this.extras = extras;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
