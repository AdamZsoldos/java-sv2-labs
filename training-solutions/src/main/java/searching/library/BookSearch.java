package searching.library;

import java.util.List;

public class BookSearch {

    private final List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorAndTitle(String author, String title) {
        validateAuthor(author);
        validateTitle(title);
        int i = books.indexOf(new Book(0, title, author));
        if (i >= 0) {
            return books.get(i);
        }
        throw new IllegalArgumentException("Book not found");
    }

    private void validateAuthor(String author) {
        if (isNullOrBlank(author)) {
            throw new IllegalArgumentException("Author is null or blank");
        }
    }

    private void validateTitle(String title) {
        if (isNullOrBlank(title)) {
            throw new IllegalArgumentException("Title is null or blank");
        }
    }

    private boolean isNullOrBlank(String title) {
        return title == null || title.isBlank();
    }
}
