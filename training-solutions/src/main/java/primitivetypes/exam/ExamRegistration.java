package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println();
        System.out.println("Exam Registration");

        while (true) {
            System.out.println();
            System.out.println("Participants:");
            System.out.println(exam.getFormattedPersonList());

            while (true) {
                System.out.println("[A] - Add participant");
                System.out.println("[Q] - Quit");
                System.out.print("Enter command: ");
                String command = scanner.nextLine().toUpperCase().trim();
                if ("A".equals(command)) break;
                if ("Q".equals(command)) return;
                System.out.println("Unknown command.");
                System.out.println();
            }

            System.out.print("Participant name: ");
            String name = scanner.nextLine();

            System.out.print("Year of birth: ");
            int yearOfBirth = Integer.parseInt(scanner.nextLine());

            System.out.print("Month of birth: ");
            int monthOfBirth = Integer.parseInt(scanner.nextLine());

            System.out.print("Day of birth: ");
            int dayOfBirth = Integer.parseInt(scanner.nextLine());

            System.out.print("Zip code: ");
            int zipCode = Integer.parseInt(scanner.nextLine());

            System.out.print("Grade average for the semester: ");
            double averageGrade = Double.parseDouble(scanner.nextLine());

            exam.addPerson(new Person(name, LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth), zipCode, averageGrade));
        }
    }
}
