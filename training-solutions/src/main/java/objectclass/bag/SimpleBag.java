package objectclass.bag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private final List<Object> items = new ArrayList<>();
    private int cursor;

    public void putItem(Object item) {
        items.add(cursor++, item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = 0;
    }

    public boolean hasNext() {
        return items.size() > cursor;
    }

    public Object next() {
        return items.get(cursor++);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
