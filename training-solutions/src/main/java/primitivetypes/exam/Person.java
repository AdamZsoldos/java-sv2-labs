package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthDate;
    private int zipCode;
    private double averageGrade;

    public Person(String name, LocalDate birthDate, int zipCode, double averageGrade) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", birth date: " + birthDate + ", zip code: " + zipCode + ", average grade: " + averageGrade;
    }
}
