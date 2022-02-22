package jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class EmployeesDao {

    private final JdbcTemplate jdbcTemplate;

    public EmployeesDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long createEmployee(String name) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into employees(emp_name) values (?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            return ps;
        }, keyHolder);
        return getKey(keyHolder);
    }

    public List<String> listEmployeeNames() {
        return jdbcTemplate.query("select emp_name from employees",
                (rs, row) -> rs.getString("emp_name"));
    }

    public String findEmployeeNameById(long id) {
        return jdbcTemplate.queryForObject("select emp_name from employees where id = ?",
                (rs, row) -> rs.getString("emp_name"), id);
    }

    private long getKey(KeyHolder keyHolder) {
        Number key = keyHolder.getKey();
        if (key != null) return key.longValue();
        else throw new IllegalStateException("No key has been generated");
    }
}
