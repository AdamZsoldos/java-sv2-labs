package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;
    List<Activity> activities = List.of(
            new Activity(1, LocalDateTime.parse("2020-01-01T10:15"), "Morning run", ActivityType.RUNNING, List.of(
                    new TrackPoint(1, LocalDate.parse("2020-01-01"), 20.5, 170.4),
                    new TrackPoint(2, LocalDate.parse("2020-01-04"), -72.75, -142.6),
                    new TrackPoint(3, LocalDate.parse("2020-02-10"), 41.2, 12.32)
            )),
            new Activity(2, LocalDateTime.parse("2020-01-03T12:30"), "Basketball", ActivityType.BASKETBALL),
            new Activity(3, LocalDateTime.parse("2020-01-05T08:00"), "Going to work", ActivityType.BIKING, List.of(
                    new TrackPoint(4, LocalDate.parse("2020-01-01"), -36.2, 123.5)
            ))
    );

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

        activityDao = new ActivityDao(dataSource);
        activityDao.insertActivity(activities.get(0));
        activityDao.insertActivity(activities.get(1));
        activityDao.insertActivity(activities.get(2));
    }

    @Test
    void testInsertActivity() {
        Activity expected = new Activity(4, activities.get(0).getStartTime(), activities.get(0).getDesc(), activities.get(0).getType());
        assertEquals(expected, activityDao.insertActivity(expected));
    }

    @Test
    void testFetchActivityById() {
        assertEquals(activities.get(0), activityDao.fetchActivityById(1));
        assertEquals(activities.get(1), activityDao.fetchActivityById(2));
        assertEquals(activities.get(2), activityDao.fetchActivityById(3));
    }

    @Test
    void testFetchActivities() {
        assertEquals(activities, activityDao.fetchActivities());
    }
}
