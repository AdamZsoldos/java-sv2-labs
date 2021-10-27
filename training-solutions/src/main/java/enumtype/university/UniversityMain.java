package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {

        for (University university: University.values()) {
            System.out.println(university.name() + " (" + university.getName() + ")");
        }
    }
}
