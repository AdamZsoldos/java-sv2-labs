package searching.lostandfound;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    private final int registryNumber;
    private final String description;
    private final LocalDate dateRegistered;

    public LostProperty(int registryNumber, String description, LocalDate dateRegistered) {
        this.registryNumber = registryNumber;
        this.description = description;
        this.dateRegistered = dateRegistered;
    }

    public int getRegistryNumber() {
        return registryNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    @Override
    public int compareTo(LostProperty o) {
        int byDescription = description.compareTo(o.description);
        if (byDescription != 0) { return byDescription; }
        return dateRegistered.compareTo(o.dateRegistered);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return description.equals(that.description) && dateRegistered.equals(that.dateRegistered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dateRegistered);
    }
}
