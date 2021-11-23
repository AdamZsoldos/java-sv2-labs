package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenTallerThan() {
        assertEquals(3, Height.countChildrenTallerThan(Arrays.asList(89, 90, 88, 0, -1, 91, 2, 250), 90));
    }
}
