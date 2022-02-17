package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrackPointDao {

    private final MariaDbDataSource dataSource;

    public TrackPointDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(
                        "insert into track_points(time, lat, lon, activity_id) values (?, ?, ?, ?)"
                )
        ) {
            connection.setAutoCommit(false);
            stmt.setDouble(4, activityId);
            for (TrackPoint tp : trackPoints) {
                if (!tp.isValid()) {
                    connection.rollback();
                    throw new IllegalArgumentException("Invalid coordinates");
                }
                stmt.setDate(1, Date.valueOf(tp.getTime()));
                stmt.setDouble(2, tp.getLat());
                stmt.setDouble(3, tp.getLon());
                stmt.executeUpdate();
            }
            connection.commit();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot insert", e);
        }
    }

    public List<TrackPoint> fetchTrackPointsByActivityId(long id) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = setFetchByIdStatementParams(connection.prepareStatement(
                        "select * from track_points where activity_id = ?"
                ), id);
                ResultSet rs = stmt.executeQuery()
        ) {
            return createTrackPointsFromResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot fetch", e);
        }
    }

    private PreparedStatement setFetchByIdStatementParams(PreparedStatement stmt, long id) throws SQLException {
        stmt.setLong(1, id);
        return stmt;
    }

    private List<TrackPoint> createTrackPointsFromResultSet(ResultSet rs) {
        try {
            List<TrackPoint> result = new ArrayList<>();
            while (rs.next()) {
                result.add(new TrackPoint(
                        rs.getLong("id"),
                        rs.getDate("time").toLocalDate(),
                        rs.getDouble("lat"),
                        rs.getDouble("lon")
                ));
            }
            return result;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot fetch", e);
        }
    }
}
