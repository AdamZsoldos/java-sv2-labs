package jdbctemplate;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    void setUp() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
        dataSource.setUserName("root");
        dataSource.setPassword("root");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    void testCreate() {
        assertEquals(1, employeesDao.createEmployee("Jill Doe"));
        assertEquals(List.of("Jill Doe"), employeesDao.listEmployeeNames());
        assertEquals(2, employeesDao.createEmployee("Jack Doe"));
        assertEquals(List.of("Jill Doe", "Jack Doe"), employeesDao.listEmployeeNames());
    }

    @Test
    void testFindById() {
        assertEquals("Jill Doe", employeesDao.findEmployeeNameById(employeesDao.createEmployee("Jill Doe")));
    }
}
