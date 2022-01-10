package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Books list is null");
        } else if (books.isEmpty()) {
            throw new IllegalArgumentException("Books list is empty");
        }
        return books.get(0);
    }
}
