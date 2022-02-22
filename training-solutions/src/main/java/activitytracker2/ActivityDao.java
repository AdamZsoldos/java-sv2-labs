package activitytracker2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sqlutil.SqlUtil;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ActivityDao {

    private final JdbcTemplate jdbcTemplate;
    private final TrackPointDao trackPointDao;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        trackPointDao = new TrackPointDao(dataSource);
    }

    public Activity insertActivity(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> SqlUtil.createStatement(con, Statement.RETURN_GENERATED_KEYS,
                "insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)",
                activity.getStartTime(), activity.getDesc(), activity.getType().name()), keyHolder);
        long id = SqlUtil.getKey(keyHolder);
        trackPointDao.insertTrackPoints(activity.getTrackPoints(), id);
        return fetchActivityById(id);
    }

    public List<Activity> fetchActivities() {
        return jdbcTemplate.query("select * from activities", this::createActivity);
    }

    public Activity fetchActivityById(long id) {
        return jdbcTemplate.queryForObject("select * from activities where id = ?",
                this::createActivity, id);
    }

    private Activity createActivity(ResultSet rs, int rowNum) throws SQLException {
        return new Activity(
                rs.getLong("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                ActivityType.valueOf(rs.getString("activity_type")),
                trackPointDao.fetchTrackPointsByActivityId(rs.getLong("id"))
        );
    }
}
