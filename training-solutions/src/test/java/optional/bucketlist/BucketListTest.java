package optional.bucketlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList = new BucketList();

    @BeforeEach
    void setUp() {
        bucketList.getDestinations().add(new Destination("India", "Taj Mahal", 5000));
        bucketList.getDestinations().add(new Destination("Hungary", "Esztergom", 100));
    }

    @Test
    void testGetDestinationWithKeyword() {
        assertEquals(Optional.of(bucketList.getDestinations().get(0)), bucketList.getDestinationWithKeyword("Mahal"));
        assertEquals(Optional.empty(), bucketList.getDestinationWithKeyword("Mahal_"));
    }

    @Test
    void testGetDestinationNearerThan() {
        assertEquals(Optional.of(bucketList.getDestinations().get(1)), bucketList.getDestinationNearerThan(100));
        assertEquals(Optional.empty(), bucketList.getDestinationNearerThan(99));
    }
}
