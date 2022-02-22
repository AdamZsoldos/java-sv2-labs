package activitytracker2;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TrackPointDao {

    private final JdbcTemplate jdbcTemplate;

    public TrackPointDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        for (TrackPoint tp : trackPoints) {
            jdbcTemplate.update("insert into track_points(time, lat, lon, activity_id) values (?, ?, ?, ?)",
                    tp.getTime(), tp.getLat(), tp.getLon(), activityId);
        }
    }

    public List<TrackPoint> fetchTrackPointsByActivityId(long id) {
        return jdbcTemplate.query("select * from track_points where activity_id = ?",
                this::createTrackPoint, id);
    }

    private TrackPoint createTrackPoint(ResultSet rs, int rowNum) throws SQLException {
        return new TrackPoint(
                rs.getLong("id"),
                rs.getDate("time").toLocalDate(),
                rs.getDouble("lat"),
                rs.getDouble("lon")
        );
    }
}
