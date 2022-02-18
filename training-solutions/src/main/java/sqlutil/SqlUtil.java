package sqlutil;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SqlUtil {

    private SqlUtil() {
    }

    public static PreparedStatement createParameterizedStatement(Connection connection, String sql, Object... params) throws SQLException {
        @SuppressWarnings("java:S2095")
        PreparedStatement stmt = connection.prepareStatement(sql);
        for (int i = 1; i < params.length + 1; i++) {
            Object param = params[i - 1];
            if (param instanceof String s) {
                stmt.setString(i, s);
            } else if (param instanceof Integer j) {
                stmt.setInt(i, j);
            } else if (param instanceof Long l) {
                stmt.setLong(i, l);
            } else if (param instanceof Double d) {
                stmt.setDouble(i, d);
            } else if (param instanceof LocalDate date) {
                stmt.setDate(i, Date.valueOf(date));
            } else if (param instanceof LocalDateTime dateTime) {
                stmt.setTimestamp(i, Timestamp.valueOf(dateTime));
            } else if (param instanceof LocalTime time) {
                stmt.setTime(i, Time.valueOf(time));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type at index %d: %s", i, param.getClass().getName()));
            }
        }
        return stmt;
    }

    public static Connection createTransactionalConnection(DataSource dataSource) throws SQLException {
        @SuppressWarnings("java:S2095")
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        return connection;
    }
}
