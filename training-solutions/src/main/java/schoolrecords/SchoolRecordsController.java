package schoolrecords;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {

    private ClassRecords classRecords;
    private List<Subject> subjects;
    private List<Tutor> tutors;
    private boolean terminate = false;

    public static void main(String[] args) {
        SchoolRecordsController controller = new SchoolRecordsController();
        controller.classRecords = new ClassRecords("1A", new Random());
        controller.initSchool();
        Scanner scanner = new Scanner(System.in);
        while(!controller.terminate) {
            controller.printMenu();
            controller.takeMenuInput(scanner);
        }
    }

    private void initSchool() {
        subjects = List.of(
                new Subject("Matematika"),
                new Subject("Irodalom"),
                new Subject("Testnevelés"),
                new Subject("Fizika")
        );
        tutors = List.of(
                new Tutor("John Doe", List.of(subjects.get(0), subjects.get(3))),
                new Tutor("Jane Roe", List.of(subjects.get(1))),
                new Tutor("Jill Poe", List.of(subjects.get(2)))
        );
    }

    private void printMenu() {
        System.out.println();
        System.out.println("1. Diákok nevének listázása");
        System.out.println("2. Diák név alapján keresése");
        System.out.println("3. Diák létrehozása");
        System.out.println("4. Diák törlése");
        System.out.println("5. Diák feleltetése");
        System.out.println("6. Osztályátlag kiszámolása");
        System.out.println("7. Tantárgyi átlag kiszámolása");
        System.out.println("8. Diákok átlagának megjelenítése");
        System.out.println("9. Diák átlagának kiírása");
        System.out.println("10. Diák tantárgyhoz tartozó átlagának kiírása");
        System.out.println("11. Kilépés");
        System.out.println();
        System.out.print("Adja meg a parancsot: ");
    }

    private void takeMenuInput(Scanner scanner) {
        switch (scanner.nextLine().trim()) {
            case "1" -> listStudentNames();
            case "2" -> findStudentByName(scanner);
            case "3" -> createStudent(scanner);
            case "4" -> deleteStudent(scanner);
            case "5" -> selectAndGradeRandomStudent(scanner);
            case "6" -> printClassGradeAverage();
            case "7" -> printClassGradeAverageBySubject(scanner);
            case "8" -> printStudentGradeAverageList();
            case "9" -> printStudentGradeAverage(scanner);
            case "10" -> printStudentGradeAverageBySubject(scanner);
            case "11" -> terminate();
            default -> printUnknownInputError();
        }
    }

    private void listStudentNames() {
        System.out.println("Diákok neveinek listázása:");
        String names = classRecords.listStudentNames();
        System.out.println(!names.isEmpty() ? names : "Nincs találat.");
    }

    private void findStudentByName(Scanner scanner) {
        System.out.print("Kiírandó diák neve: ");
        try {
            Student student = classRecords.findStudentByName(scanner.nextLine().trim());
            System.out.println(student);
        } catch (IllegalArgumentException e) {
            System.out.println("A diák nem található!");
        }
    }

    private void createStudent(Scanner scanner) {
        System.out.print("Új diák neve: ");
        boolean result = classRecords.addStudent(new Student(scanner.nextLine().trim()));
        System.out.println(result ? "Diák sikeresen létrehozva." : "Diák létrehozása sikertelen!");
    }

    private void deleteStudent(Scanner scanner) {
        System.out.print("Törlendő diák neve: ");
        try {
            Student student = classRecords.findStudentByName(scanner.nextLine().trim());
            boolean result = classRecords.removeStudent(student);
            System.out.println(result ? "Diák sikeresen törölve." : "Diák törlése sikertelen!");
        } catch (IllegalArgumentException e) {
            System.out.println("A diák nem található!");
        }
    }

    private void selectAndGradeRandomStudent(Scanner scanner) {
        Student student;
        MarkType grade;
        Subject subject;
        Tutor tutor;
        try {
            student = classRecords.selectRandomStudent();
            System.out.println(student);
        } catch (IllegalStateException e) {
            System.out.println("Nem található diák!");
            return;
        }
        try {
            grade = inputGrade(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println("Érvénytelen érdemjegy!");
            return;
        }
        try {
            subject = inputSubject(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println("Tantárgy nem található!");
            return;
        }
        try {
            tutor = inputTutor(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println("Oktató nem található!");
            return;
        }
        student.grade(new Mark(grade, subject, tutor));
        System.out.println("Eredmény rögzítve.");
    }

    private void printClassGradeAverage() {
        try {
            double gradeAverage = classRecords.calculateClassAverage();
            System.out.println("Osztályátlag: " + gradeAverage);
        } catch (ArithmeticException e) {
            System.out.println("Osztályátlag nem számolható!");
        }
    }

    private void printClassGradeAverageBySubject(Scanner scanner) {
        Subject subject;
        try {
            subject = inputSubject(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println("Tantárgy nem található!");
            return;
        }
        try {
            double gradeAverage = classRecords.calculateClassAverageBySubject(subject);
            System.out.println(subject.getSubjectName() + " osztályátlag: " + gradeAverage);
        } catch (ArithmeticException e) {
            System.out.println("Osztályátlag nem számolható!");
        }
    }

    private void printStudentGradeAverageList() {
        System.out.println("Diákok átlagainak listázása:");
        List<StudyResultByName> studyResults = classRecords.listStudyResults();
        System.out.println(!studyResults.isEmpty() ? studyResults : "Nincs találat.");
    }

    private void printStudentGradeAverage(Scanner scanner) {
        Student student;
        System.out.print("Diák neve: ");
        try {
            student = classRecords.findStudentByName(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("A diák nem található!");
            return;
        }
        try {
            System.out.println(student.getName() + " összátlaga: " + student.calculateAverage());
        } catch (ArithmeticException e) {
            System.out.println("Összátlag nem számolható!");
        }
    }

    private void printStudentGradeAverageBySubject(Scanner scanner) {
        Student student;
        Subject subject;
        System.out.print("Diák neve: ");
        try {
            student = classRecords.findStudentByName(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("A diák nem található!");
            return;
        }
        try {
            subject = inputSubject(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println("Tantárgy nem található!");
            return;
        }
        try {
            System.out.println(student.getName() + " tantárgyátlaga: " + student.calculateSubjectAverage(subject));
        } catch (ArithmeticException e) {
            System.out.println("Tantárgyátlag nem számolható!");
        }
    }

    private MarkType inputGrade(Scanner scanner) {
        System.out.print("Érdemjegy: ");
        String input = scanner.nextLine().trim();
        for (MarkType markType : MarkType.values()) {
            if (String.valueOf(markType.getNumericValue()).equals(input) || markType.name().equalsIgnoreCase(input)) {
                return markType;
            }
        }
        throw new IllegalArgumentException("Invalid mark type.");
    }

    private Subject inputSubject(Scanner scanner) {
        System.out.print("Tantárgy neve: ");
        String input = scanner.nextLine().trim();
        for (Subject subject : subjects) {
            if (subject.getSubjectName().equalsIgnoreCase(input)) {
                return subject;
            }
        }
        throw new IllegalArgumentException("Subject not found.");
    }

    private Tutor inputTutor(Scanner scanner) {
        System.out.print("Oktató neve: ");
        String input = scanner.nextLine().trim();
        for (Tutor tutor : tutors) {
            if (tutor.getName().equalsIgnoreCase(input)) {
                return tutor;
            }
        }
        throw new IllegalArgumentException("Tutor not found.");
    }

    private void terminate() {
        terminate = true;
    }

    private void printUnknownInputError() {
        System.out.println("Ismeretlen parancs!");
    }
}
