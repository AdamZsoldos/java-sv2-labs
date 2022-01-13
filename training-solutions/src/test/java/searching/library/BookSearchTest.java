package searching.library;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    BookSearch search = new BookSearch(List.of(
            new Book(0, "The Lord of the Rings", "J. R. R. Tolkien"),
            new Book(1, "The Raven", "E. A. Poe"),
            new Book(2, "The Hobbit", "J. R. R. Tolkien")
    ));

    @Test
    void testFindBookByAuthorAndTitle() {
        Book book = search.findBookByAuthorAndTitle("E. A. Poe", "The Raven");
        assertEquals(1, book.getId());
        assertEquals("The Raven", book.getTitle());
        assertEquals("E. A. Poe", book.getAuthor());
    }

    @Test
    void testFindBookByAuthorAndTitleNotFound() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> search.findBookByAuthorAndTitle("E. A. Poe", "The Pit and the Pendulum"));
        assertEquals("Book not found", e.getMessage());
    }

    @Test
    void testFindBookByAuthorAndTitleWithNullAuthor() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> search.findBookByAuthorAndTitle(null, "The Raven"));
        assertEquals("Author is null or blank", e.getMessage());
    }

    @Test
    void testFindBookByAuthorAndTitleWithBlankTitle() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> search.findBookByAuthorAndTitle("E. A. Poe", "   "));
        assertEquals("Title is null or blank", e.getMessage());
    }
}
