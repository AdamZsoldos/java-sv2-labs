package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("The Hobbit");
        System.out.println(book.getTitle());

        book.setTitle("Lord of the Rings");
        System.out.println(book.getTitle());
    }
}
