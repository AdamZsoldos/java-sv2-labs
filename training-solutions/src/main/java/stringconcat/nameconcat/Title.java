package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private String name;

    Title(String title) {
        this.name = title;
    }

    public String getTitle() {
        return name;
    }
}
