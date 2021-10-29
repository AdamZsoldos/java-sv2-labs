package stringconcat.nameconcat;

public class Name {

    private final String familyName;
    private final String middleName;
    private final String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String name = title != null ? title.getTitle() + " " : "";
        name += givenName + " ";
        if (!middleName.isEmpty()) name += middleName + " ";
        name += familyName;
        return name;
    }

    public String concatNameHungarianStyle() {
        String name = title != null ? title.getTitle() + " " : "";
        name = name.concat(familyName + " ");
        if (!middleName.isEmpty()) name = name.concat(middleName + " ");
        name = name.concat(givenName);
        return name;
    }
}
