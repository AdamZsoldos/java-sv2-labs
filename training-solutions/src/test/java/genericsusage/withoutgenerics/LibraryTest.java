package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    List<Book> books = List.of(
            new Book("The Lord of the Rings"),
            new Book("The Hobbit")
    );
    Library library = new Library();

    @Test
    void testGetFirstBook() {
        assertEquals("The Lord of the Rings", library.getFirstBook(books).getTitle());
    }

    @Test
    void testGetFirstBookWithNull() {
        assertThrows(NullPointerException.class, () -> library.getFirstBook(null), "Books list is null");
    }

    @Test
    void testGetFirstBookWithEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> library.getFirstBook(List.of()), "Books list is empty");
    }

    @Test
    void testGetFirstBookWithNonBookList() {
        assertThrows(IllegalArgumentException.class, () -> library.getFirstBook(List.of("Hello", "World")), "First element in books list is not a book");
    }
}
