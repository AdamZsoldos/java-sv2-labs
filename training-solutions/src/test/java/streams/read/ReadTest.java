package streams.read;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

    Read read = new Read();

    @BeforeEach
    void setUp() {
        read.getBooks().add(new Book("J. R. R. Tolkien", "The Hobbit", 300));
        read.getBooks().add(new Book("E. A. Poe", "The Raven", 400));
        read.getBooks().add(new Book("J. R. R. Tolkien", "The Fellowship of the Rings", 500));
    }

    @Test
    void testListBookTitlesShorterThan() {
        assertEquals(List.of("The Hobbit", "The Raven"), read.listBookTitlesShorterThan(400));
    }

    @Test
    void testListBookTitlesWithAuthor() {
        assertEquals(List.of("The Fellowship of the Rings", "The Hobbit"), read.listBookTitlesWithAuthor("J. R. R. Tolkien"));
    }

    @Test
    void testListAuthors() {
        assertEquals(List.of("J. R. R. Tolkien", "E. A. Poe"), read.listAuthors());
    }
}
