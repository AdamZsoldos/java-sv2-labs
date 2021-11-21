package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    private final List<String> birthdays = new ArrayList<>();

    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        Scanner scanner = new Scanner(System.in);
        int count = birthday.readCount(scanner);
        for (int i = 1; i <= count; i++) {
            birthday.addBirthday(scanner, i);
        }
        birthday.writeBirthdays();
    }

    private int readCount(Scanner scanner) {
        System.out.println("How many birthdays would you like to enter?");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private void addBirthday(Scanner scanner, int ordinal) {
        System.out.println("Birthday #" + ordinal + ':');
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter year of birth: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter month of birth: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter day of birth: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        birthdays.add(name + ": " + LocalDate.of(year, month, day));
    }

    private void writeBirthdays() {
        try {
            Files.write(Paths.get("files/birthday.txt"), birthdays);
        } catch (IOException ioe) {
            System.out.println("Cannot write file");
            ioe.printStackTrace();
        }
    }
}
