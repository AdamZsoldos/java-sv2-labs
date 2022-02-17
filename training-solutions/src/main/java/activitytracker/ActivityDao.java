package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private final MariaDbDataSource dataSource;

    public ActivityDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = setInsertStatementParams(connection.prepareStatement(
                        "insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)",
                        Statement.RETURN_GENERATED_KEYS
                ), activity);
                ResultSet rs = executeStatementAndGetGeneratedKeys(stmt)
        ) {
            if (rs.next()) {
                long id = rs.getLong(1);
                TrackPointDao trackPointDao = new TrackPointDao(dataSource);
                trackPointDao.insertTrackPoints(activity.getTrackPoints(), id);
                return fetchActivityById(id);
            }
            throw new IllegalStateException("No key has been generated");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    public Activity fetchActivityById(long id) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = setFetchByIdStatementParams(connection.prepareStatement(
                        "select * from activities where id = ?"
                ), id);
                ResultSet rs = stmt.executeQuery()
        ) {
            if (rs.next()) {
                return createActivityFromResultSet(rs);
            }
            throw new IllegalArgumentException("No result");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot fetch", e);
        }
    }

    public List<Activity> fetchActivities() {
        try (
                Connection connection = dataSource.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("select * from activities")
        ) {
            List<Activity> result = new ArrayList<>();
            while (rs.next()) {
                result.add(createActivityFromResultSet(rs));
            }
            return result;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot fetch", e);
        }
    }

    private ResultSet executeStatementAndGetGeneratedKeys(PreparedStatement stmt) throws SQLException {
        stmt.executeUpdate();
        return stmt.getGeneratedKeys();
    }

    private PreparedStatement setInsertStatementParams(PreparedStatement stmt, Activity activity) throws SQLException {
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDesc());
        stmt.setString(3, activity.getType().name());
        return stmt;
    }

    private PreparedStatement setFetchByIdStatementParams(PreparedStatement stmt, long id) throws SQLException {
        stmt.setLong(1, id);
        return stmt;
    }

    private Activity createActivityFromResultSet(ResultSet rs) throws SQLException {
        TrackPointDao trackPointDao = new TrackPointDao(dataSource);
        return new Activity(
                rs.getLong("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                ActivityType.valueOf(rs.getString("activity_type")),
                trackPointDao.fetchTrackPointsByActivityId(rs.getLong("id"))
        );
    }
}
