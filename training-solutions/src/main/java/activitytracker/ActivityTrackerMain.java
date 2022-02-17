package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
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
        activityDao.insertActivity(new Activity(LocalDateTime.parse("2020-01-03T12:30"), "Basketball", ActivityType.BASKETBALL));
        activityDao.insertActivity(new Activity(LocalDateTime.parse("2020-01-05T08:00"), "Going to work", ActivityType.BIKING));
        System.out.println(activityDao.fetchActivityById(1));
        System.out.println(activityDao.fetchActivityById(2));
        System.out.println(activityDao.fetchActivityById(3));
        System.out.println(activityDao.fetchActivities());
    }
}
