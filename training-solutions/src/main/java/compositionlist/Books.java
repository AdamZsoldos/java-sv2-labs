package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private final List<String> titles = new ArrayList<>();

    public List<String> getTitles() {
        return titles;
    }

    public void add(String title) {
        if (titles.contains(title)) return;
        titles.add(title);
    }

    public boolean remove(String title) {
        int i = indexOf(title);
        if (i < 0) return false;
        titles.remove(i);
        return true;
    }

    public void setAuthor(String title, String author) {
        int i = indexOf(title);
        if (i < 0) return;
        titles.set(i, author + ": " + title);
    }

    public boolean contains(String title) {
        return indexOf(title) >= 0;
    }

    private int indexOf(String title) {
        int i = titles.indexOf(title);
        if (i >= 0) return i;

        String[] parts;
        for (i = 0; i < titles.size(); i++) {
            parts = titles.get(i).split(": ");
            if (parts.length > 1 && parts[1].equals(title)) return i;
        }

        return -1;
    }
}
