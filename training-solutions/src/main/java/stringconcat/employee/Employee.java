package stringconcat.employee;

public class Employee {

    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + position + " - " + salary + " Ft";
    }
}
