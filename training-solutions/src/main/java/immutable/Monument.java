package immutable;

import java.time.LocalDate;

public class Monument {

    private final String name;
    private final String title;
    private final LocalDate dateOfRegistration;
    private final String registryNumber;

    public Monument(String name, String title, LocalDate dateOfRegistration, String registryNumber) {
        if (isStringEmpty(name)) throw new IllegalArgumentException("Name cannot be empty!");
        if (isStringEmpty(title)) throw new IllegalArgumentException("Title cannot be empty!");
        if (isDateEmpty(dateOfRegistration)) throw new IllegalArgumentException("Date of registration cannot be empty!");
        if (isStringEmpty(registryNumber)) throw new IllegalArgumentException("Registry number cannot be empty!");
        this.name = name;
        this.title = title;
        this.dateOfRegistration = dateOfRegistration;
        this.registryNumber = registryNumber;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    private boolean isStringEmpty(String s) {
        return s == null || s.isBlank();
    }

    private boolean isDateEmpty(LocalDate d) {
        return d == null;
    }
}
