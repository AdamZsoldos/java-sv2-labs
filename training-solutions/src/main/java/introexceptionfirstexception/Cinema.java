package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        new Cinema().purchaseTicket();
    }

    private void purchaseTicket() {
        Scanner sc = new Scanner(System.in);
        String name = readName(sc);
        String movieTitle = readMovieTitle(sc);
        int numTickets = readNumTickets(sc);
        int seatRow = readSeatRow(sc);
        printTicketPurchase(name, movieTitle, numTickets, seatRow);
    }

    private void printTicketPurchase(String name, String movieTitle, int numTickets, int seatRow) {
        System.out.println("Ticket purchase details:");
        System.out.println("Customer name: " + name);
        System.out.println("Movie title: " + movieTitle);
        System.out.println("Seats reserved: " + getSeats(numTickets, seatRow));
    }

    private String getSeats(int numTickets, int seatRow) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numTickets; i++) {
            if (i > 1) sb.append(", ");
            sb.append(getOrdinal(seatRow)).append(" row ").append(getOrdinal(i)).append(" seat");
        }
        return sb.toString();
    }

    private String readName(Scanner sc) {
        System.out.print("Please enter your name: ");
        return sc.nextLine();
    }

    private String readMovieTitle(Scanner sc) {
        System.out.print("Enter movie title: ");
        return sc.nextLine();
    }

    private int readNumTickets(Scanner sc) {
        System.out.print("Number of tickets to purchase: ");
        return sc.nextInt();
    }

    private int readSeatRow(Scanner sc) {
        System.out.print("Seating row: ");
        return sc.nextInt();
    }

    private String getOrdinal(int number) {
        String s = String.valueOf(number);
        char lastDigit = (s.length() >= 2 && s.charAt(s.length() - 2) == '1') ? 0 : s.charAt(s.length() - 1);
        return number + switch (lastDigit) {
            case '1' -> "st";
            case '2' -> "nd";
            case '3' -> "rd";
            default -> "th";
        };
    }
}
