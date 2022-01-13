package searching.lostandfound;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LostAndFoundOffice {

    private final List<LostProperty> lostProperties = new ArrayList<>();

    public List<LostProperty> getLostProperties() {
        return lostProperties;
    }

    public LostProperty findLostProperty(String description) {
        Comparator<LostProperty> comparator = Comparator.comparing(LostProperty::getDescription);
        lostProperties.sort(comparator);
        int i = Collections.binarySearch(lostProperties, new LostProperty(0, description, LocalDate.now()), comparator);
        if (i >= 0) { return lostProperties.get(i); }
        throw new IllegalArgumentException("Property not found");
    }
}
