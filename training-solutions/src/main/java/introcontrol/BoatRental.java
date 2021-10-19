package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBoat Rental Submission Form\n");
        System.out.println("Please enter number of passengers:");
        int persons = scanner.nextInt();
        if (persons < 0) persons = 0;
        int seatsLeft = persons >= 10 ? 0 : 10 - persons;

        if (persons >= 4) {
            persons -= 5;
            System.out.println("- 5 person boat rented");
        }

        if (persons >= 3) {
            persons -= 3;
            System.out.println("- 3 person boat rented");
        }

        if (persons >= 1) {
            persons -= 2;
            System.out.println("- 2 person boat rented");
        }

        if (persons > 1) System.out.println(persons + " passengers must remain on shore.");
        else if (persons == 1) System.out.println(persons + " passenger must remain on shore.");
        else if (persons == -1)  System.out.println(-persons + " seat left onboard.");
        else System.out.println(-persons + " seats left onboard.");

        if (seatsLeft == 1) System.out.println("Rental service can accommodate " + seatsLeft + " more passenger.");
        else System.out.println("Rental service can accommodate " + seatsLeft + " more passengers.");
    }
}
