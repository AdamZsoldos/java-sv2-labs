package streams.read;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Read {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public List<String> listBookTitlesShorterThan(int maxNumberOfPages) {
        return books.stream()
                .filter(book -> book.getNumberOfPages() <= maxNumberOfPages)
                .map(Book::getTitle)
                .toList();
    }

    public List<String> listBookTitlesWithAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted(Collator.getInstance(Locale.US))
                .toList();
    }

    public List<String> listAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .toList();
    }
}
