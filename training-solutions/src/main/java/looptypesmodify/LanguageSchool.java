package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe"));
        students.add(new Student("Jane Boe"));
        students.add(new Student("Jack Goe"));
        students.add(new Student("Jill Roe"));
        students.add(new Student("Jimmy Toe"));
        students.add(new Student("Jess Poe"));

        students.get(1).setActive(false);
        students.get(2).setActive(false);
        students.get(4).setActive(false);

        System.out.println("Students: " + students + " (" + students.size() + ")");

        System.out.println("Purging inactive students from list.");
        List<Student> inactiveStudents = new ArrayList<>();
        for (Student student: students) {
            if (!student.isActive()) inactiveStudents.add(student);
        }
        students.removeAll(inactiveStudents);

        System.out.println("Students: " + students + " (" + students.size() + ")");
    }
}
