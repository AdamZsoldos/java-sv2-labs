package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Jane Doe", 2020, 450000);

        System.out.println(employee);

        employee.raiseSalary(35000);

        System.out.println(employee);
    }
}
