package algorithmsfilter.movie;

public class Movie {

    private final String title;
    private final Category category;
    private final int rating;

    public Movie(String title, Category category, int rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }
}
