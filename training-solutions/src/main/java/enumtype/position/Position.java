package enumtype.position;

public enum Position {
    DEVELOPER(100, "medical insurance"),
    PROJECT_LEAD(200, "life insurance"),
    MANAGER(300, "retirement benefits");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
