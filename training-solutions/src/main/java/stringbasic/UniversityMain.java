package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {

        University u = new University();

        u.addStudent(new Student(new Person(
                "John Doe",
                "john@example.com",
                "12345",
                "00000000-00000000-00000000",
                "+36209999999"),
                "23456",
                "34567"));

        u.addStudent(new Student(new Person(
                "John Doe",
                "john@example.com",
                "12345",
                "00000000-00000000-00000000",
                "+36209999999"),
                "23456",
                "34567"));

        u.addStudent(new Student(new Person(
                "Jane Doe",
                "jane@example.com",
                "45678",
                "11111111-11111111-11111111",
                "+36208888888"),
                "56789",
                "67890"));

        u.getStudents().get(0).setEntryCardNumber("01234");
        u.getStudents().get(2).setEntryCardNumber("43210");

        for (Student student: u.getStudents()) {
            System.out.println(student);
        }

        System.out.println(u.areStudentsEqual(u.getStudents().get(0), u.getStudents().get(1)));
        System.out.println(u.areStudentsEqual(u.getStudents().get(0), u.getStudents().get(2)));
    }
}
