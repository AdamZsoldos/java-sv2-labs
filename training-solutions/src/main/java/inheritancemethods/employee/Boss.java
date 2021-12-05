package inheritancemethods.employee;

public class Boss extends Employee {

    public static final double LEADERSHIP_FACTOR = 0.1;
    private final int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (1 + LEADERSHIP_FACTOR * numberOfEmployees);
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
