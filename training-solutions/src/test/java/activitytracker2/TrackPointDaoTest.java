package activitytracker2;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrackPointDaoTest {

    TrackPointDao trackPointDao;

    @BeforeEach
    void setUp() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker_test?useUnicode=true");
            dataSource.setUserName("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.insertActivity(new Activity(LocalDateTime.parse("2020-01-01T10:15"), "Morning run", ActivityType.RUNNING));

        trackPointDao = new TrackPointDao(dataSource);
    }

    @Test
    void testInsertTrackPoints() {
        List<TrackPoint> trackPoints = List.of(
                new TrackPoint(1, LocalDate.parse("2020-01-01"), 20, -175),
                new TrackPoint(2, LocalDate.parse("2020-01-03"), -70.5, -50),
                new TrackPoint(3, LocalDate.parse("2020-01-05"), 64.2, 160.4)
        );
        trackPointDao.insertTrackPoints(trackPoints, 1);
        assertEquals(trackPoints, trackPointDao.fetchTrackPointsByActivityId(1));
        assertEquals(List.of(), trackPointDao.fetchTrackPointsByActivityId(2));
    }

    /*@Test
    void testInsertTrackPointsRollback() {
        List<TrackPoint> trackPoints = List.of(
                new TrackPoint(1, LocalDate.parse("2020-01-01"), 20, -175),
                new TrackPoint(2, LocalDate.parse("2020-01-03"), -70.5, -50),
                new TrackPoint(3, LocalDate.parse("2020-01-05"), 64.2, 1800.4)
        );
        Exception e = assertThrows(IllegalArgumentException.class, () -> trackPointDao.insertTrackPoints(trackPoints, 1));
        assertEquals("Invalid coordinates", e.getMessage());
        assertEquals(List.of(), trackPointDao.fetchTrackPointsByActivityId(1));
    }*/
}
