package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Books list is null");
        } else if (books.isEmpty()) {
            throw new IllegalArgumentException("Books list is empty");
        } else if (!(books.get(0) instanceof Book)) {
            throw new IllegalArgumentException("First element in books list is not a book");
        }
        return (Book) books.get(0);
    }
}
