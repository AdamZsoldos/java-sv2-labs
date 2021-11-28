package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();
    FieldPoint fp1 = new FieldPoint(LocalDateTime.of(1990, 1, 1, 10, 0), 15.0, 25.0);
    FieldPoint fp2 = new FieldPoint(LocalDateTime.of(1990, 1, 1, 10, 15), 15.6, 25.2);
    FieldPoint fp3 = new FieldPoint(LocalDateTime.of(1990, 1, 2, 12, 30), 15.2, 25.8);

    @Test
    void testLogFieldPoints() {
        LocalDateTime time = LocalDateTime.now();
        hikingTour.logFieldPoints(time, fp1, fp2, fp3);
        assertEquals(3, hikingTour.getFieldPoints().size());
        assertEquals(time, hikingTour.getFieldPoints().get(0).getTimeLogged());
        assertEquals(time, hikingTour.getFieldPoints().get(1).getTimeLogged());
        assertEquals(time, hikingTour.getFieldPoints().get(2).getTimeLogged());

    }

    @Test
    void testLogFieldPointsWithNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> hikingTour.logFieldPoints(null, fp1, fp2, fp3));
        assertEquals("Time of logging cannot be null!", e.getMessage());
        assertEquals(0, hikingTour.getFieldPoints().size());
    }
}
