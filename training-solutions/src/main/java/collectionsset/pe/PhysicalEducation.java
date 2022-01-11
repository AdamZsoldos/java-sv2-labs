package collectionsset.pe;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 150));
        students.add(new Student("Jill", 151));
        students.add(new Student("Jack", 149));
        students.add(new Student("Jim", 160));
        students.add(new Student("Jess", 140));
        System.out.println(getHeightOrder(students));
    }

    public static Set<Integer> getHeightOrder(List<Student> students) {
        Set<Integer> result = new TreeSet<>();
        for (Student student : students) {
            result.add(student.getHeight());
        }
        return result;
    }
}
