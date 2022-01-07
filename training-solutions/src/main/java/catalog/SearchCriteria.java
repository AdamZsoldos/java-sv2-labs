package catalog;

public final class SearchCriteria {

    private final String title;
    private final String contributor;

    public SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByContributor(String contributor) {
        validateContributor(contributor);
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        validateTitle(title);
        return new SearchCriteria(title, null);
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        validateTitle(title);
        validateContributor(contributor);
        return new SearchCriteria(title, contributor);
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }

    public boolean hasTitle() {
        return title != null;
    }

    public boolean hasContributor() {
        return contributor != null;
    }

    private static void validateContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Invalid contributor");
        }
    }

    private static void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Invalid title");
        }
    }
}
