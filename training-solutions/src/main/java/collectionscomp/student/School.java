package collectionscomp.student;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("Jill", 150));
        students.add(new Student("Jack", 160));
        students.add(new Student("John", 142));
        students.add(new Student("Jane", 137));
        students.add(new Student("Éva", 162));
        students.add(new Student("János", 158));
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        for (Student student : students) {
            studentMap.put(student.getName(), student.getHeight());
        }
        System.out.println();
        System.out.println(studentMap);
    }
}
