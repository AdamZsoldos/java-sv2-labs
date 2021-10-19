package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first time of day:");

        Time time1 = takeTimeInput(scanner);

        System.out.println("Please enter second time of day:");

        Time time2 = takeTimeInput(scanner);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 1 in minutes: " + time1.getInMinutes());
        System.out.println("Time 1 in seconds: " + time1.getInSeconds());

        System.out.println("Time 2: " + time2);
        System.out.println("Time 2 in minutes: " + time2.getInMinutes());
        System.out.println("Time 2 in seconds: " + time2.getInSeconds());

        System.out.println(time1.equals(time2) ? "Time 1 and time 2 are equal." : time1.earlierThan(time2) ? "Time 1 is earlier than time 2." : "Time 1 is later than time 2.");
    }

    public static Time takeTimeInput(Scanner scanner) {
        System.out.println("Hour:");
        int hour = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Minute:");
        int minute = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second:");
        int second = scanner.nextInt();
        scanner.nextLine();

        return new Time(hour, minute, second);
    }
}
