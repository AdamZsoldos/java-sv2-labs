package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private final List<String> authors;
    private final int numberOfPages;
    private final String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        validateTitle(title);
        validateNumberOfPages(numberOfPages);
        validateAuthors(authors);
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void validateNumberOfPages(int numberOfPages) {
        if (numberOfPages < 0) {
            throw new IllegalArgumentException("Invalid number of pages");
        }
    }

    private void validateAuthors(List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Empty authors list");
        }
    }
}
