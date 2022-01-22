package optional.bucketlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    private final List<Destination> destinations = new ArrayList<>();

    public List<Destination> getDestinations() {
        return destinations;
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination destination : destinations) {
            if (destination.getDescription().contains(keyword)) {
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThan(int maxKm) {
        for (Destination destination : destinations) {
            if (destination.getKmFromHome() <= maxKm) {
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }
}
