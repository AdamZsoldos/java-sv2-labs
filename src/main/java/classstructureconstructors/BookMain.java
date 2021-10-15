package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("J. R. R. Tolkien", "The Hobbit");
        book.register("WR3TFWNR");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());
    }
}
