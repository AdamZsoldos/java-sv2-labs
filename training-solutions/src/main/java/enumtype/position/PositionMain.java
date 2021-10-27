package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {

        for (Position position: Position.values()) {
            System.out.println("Position: " + position.name() + ", salary: " + position.getSalary() + ", benefits: " + position.getBenefit());
        }
    }
}
