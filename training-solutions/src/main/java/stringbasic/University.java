package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areStudentsEqual(Student student1, Student student2) {
        return student1.getNeptunCode().equals(student2.getNeptunCode()) && student1.getEducationId().equals(student2.getEducationId());
    }
}
