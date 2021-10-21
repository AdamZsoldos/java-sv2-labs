package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public static void main(String[] args) {
        List<String> students = Arrays.asList("John", "Jane", "Bartholomew", "Kimberleigh", "Danny", "Alexandrina", "Christopher", "Eva");
        System.out.println("Students: " + students);

        printStudyGroups(students);
    }

    public static void printStudyGroups(List<String> students) {
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        for (String name: students) {
            if (name.length() <= 10) group1.add(name);
            else group2.add(name);
        }

        System.out.println("Study group 1: " + group1);
        System.out.println("Study group 2: " + group2);
    }
}
