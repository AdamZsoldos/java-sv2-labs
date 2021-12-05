package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {

    private final List<PublicVehicle> vehicles = new ArrayList<>();

    public List<PublicVehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(PublicVehicle vehicle) {
        vehicles.add(vehicle);
    }
}
