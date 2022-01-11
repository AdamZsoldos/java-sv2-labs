package collectionslist.postman;

import java.util.LinkedList;
import java.util.List;

public class Postman {

    private final List<String> addresses = new LinkedList<>();

    public List<String> getAddresses() {
        return addresses;
    }

    public void removeAddress(String address) {
        addresses.remove(address);
    }
}
