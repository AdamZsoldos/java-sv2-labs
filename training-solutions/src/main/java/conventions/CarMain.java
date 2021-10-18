package conventions;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String carType = takeCarTypeInput(scanner);
        String engineType = takeEngineTypeInput(scanner);
        int doors = takeDoorsInput(scanner);
        int persons = takePersonsInput(scanner);

        Car car = new Car(carType, engineType, doors, persons);

        boolean quit = false;

        while (!quit) {
            printCarInfo(car);

            System.out.println("Enter command:");
            System.out.println("Change [C] car type, [E] engine type, [D] number of doors or [P] passenger capacity");
            System.out.println("[M] Add model name");
            System.out.println("[Q] Quit");

            String command = scanner.nextLine();

            switch (command.toUpperCase()) {
                case "C" -> car.setCarType(takeCarTypeInput(scanner));
                case "E" -> car.setEngineType(takeEngineTypeInput(scanner));
                case "D" -> car.setDoors(takeDoorsInput(scanner));
                case "P" -> car.setPersons(takePersonsInput(scanner));
                case "M" -> car.addModelName(takeModelInput(scanner));
                case "Q" -> quit = true;
            }
        }
    }

    public static String takeCarTypeInput(Scanner scanner) {
        System.out.println("Please enter car type:");
        return scanner.nextLine();
    }

    public static String takeEngineTypeInput(Scanner scanner) {
        System.out.println("Please enter engine type:");
        return scanner.nextLine();
    }

    public static int takeDoorsInput(Scanner scanner) {
        System.out.println("Please enter number of doors:");
        int doors = scanner.nextInt();
        scanner.nextLine();
        return doors;
    }

    public static int takePersonsInput(Scanner scanner) {
        System.out.println("Please enter passenger capacity:");
        int persons = scanner.nextInt();
        scanner.nextLine();
        return persons;
    }

    public static String takeModelInput(Scanner scanner) {
        System.out.println("Please enter model name:");
        return scanner.nextLine();
    }

    public static void printCarInfo(Car car) {
        System.out.println("Car type: " + car.getCarType());
        System.out.println("Engine type: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors() + " doors");
        System.out.println("Passenger capacity: " + car.getPersons() + " persons");
    }
}
