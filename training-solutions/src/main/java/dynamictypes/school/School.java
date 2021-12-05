package dynamictypes.school;

public class School {

    private final String name;
    private final int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "name='" + name + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }
}
