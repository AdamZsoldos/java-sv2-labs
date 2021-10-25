package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        //Objects
        new Book();
        System.out.println(new Book());

        Book emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(book == anotherBook);

        //Arrays and lists
        Book[] bookArray = new Book[]{new Book(), new Book(), new Book()};

        List<Book> bookList1 = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());

        System.out.println(Arrays.toString(bookArray));
        System.out.println(bookList1);
        System.out.println(bookList2);
    }
}
