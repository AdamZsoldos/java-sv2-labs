package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    private final Office office;
    private final Scanner scanner;
    private boolean terminate;

    public MeetingRoomController(Office office) {
        this.office = office;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController(new Office());
        controller.runMenu();
    }

    public void runMenu() {
        printMenu();

        int selection;
        try {
            selection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            selection = -1;
        }

        switch (selection) {
            case 1 -> office.addMeetingRoom(readOffice());
            case 2 -> office.printNames();
            case 3 -> office.printNamesReverse();
            case 4 -> office.printEvenNames();
            case 5 -> office.printAreas();
            case 6 -> {
                System.out.print("\nAdja meg a pontos nevet: ");
                office.printMeetingRoomsWithName(scanner.nextLine());
            }
            case 7 -> {
                System.out.print("\nAdja meg a névtöredéket: ");
                office.printMeetingRoomsContains(scanner.nextLine());
            }
            case 8 -> {
                System.out.print("\nAdja meg a minimum területet: ");
                office.printAreasLargerThan(scanner.nextInt());
                scanner.nextLine();
            }
            case 9 -> terminate();
            default -> System.out.println("\nIsmeretlen parancs!");
        }

        if (!terminate) runMenu();
    }

    public void printMenu() {
        System.out.println();
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
        System.out.print("Kérem válasszon: ");
    }

    public MeetingRoom readOffice() {
        System.out.println();
        System.out.println("Adja meg a tárgyaló adatait!");
        System.out.print("Tárgyaló neve: ");
        String name = scanner.nextLine();
        System.out.print("Tárgyaló hossza: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tárgyaló szélessége: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        return new MeetingRoom(name, length, width);
    }

    public void terminate() {
        terminate = true;
    }
}
