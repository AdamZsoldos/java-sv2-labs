package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School s1 = new School("School A", 4);
        School s2 = new PrimarySchool("School B", 5);
        School s3 = new SecondarySchool("School C", 6);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
