package compositionlist;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        final String titleQuery = "Please enter title: ";
        final String titleError = "Title not found.";
        final String authorQuery = "Enter author's name: ";
        boolean terminate = false;

        while (!terminate) {
            System.out.println();
            System.out.println("Books in library: " + books.getTitles());
            System.out.println("Main Menu");
            System.out.println("A - Add book");
            System.out.println("R - remove book");
            System.out.println("S - Set author");
            System.out.println("Q - quit");
            System.out.print("Enter command: ");

            String command = scanner.nextLine().toUpperCase();
            switch (command) {
                case "A" -> {
                    System.out.print(titleQuery);
                    books.add(scanner.nextLine());
                    System.out.println("Book added.");
                }
                case "R" -> {
                    System.out.print(titleQuery);
                    String title = scanner.nextLine();
                    if (books.remove(title)) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println(titleError);
                    }
                }
                case "S" -> {
                    System.out.print(titleQuery);
                    String title = scanner.nextLine();
                    if (books.contains(title)) {
                        System.out.print(authorQuery);
                        books.setAuthor(title, scanner.nextLine());
                        System.out.println("Author set.");
                    } else {
                        System.out.println(titleError);
                    }
                }
                case "Q" -> {
                    System.out.println("Goodbye!");
                    terminate = true;
                }
                default -> System.out.println("Unknown command.");
            }
        }
    }
}
