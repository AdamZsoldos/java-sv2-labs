package introexceptionthrow.patient;

import java.time.LocalDate;

public class Patient {

    private final String name;
    private final String socialSecurityNumber;
    private final int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
        validateName();
        validateYearOfBirth();
        validateSocialSecurityNumber();
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private void validateName() {
        if (name.isBlank()) throw new IllegalArgumentException("Name blank!");
    }

    private void validateYearOfBirth() {
        int min = 1900;
        if (yearOfBirth < min) throw new IllegalArgumentException("Year of birth below minimum value of " + min + "!");
        int max = LocalDate.now().getYear();
        if (yearOfBirth > max) throw new IllegalArgumentException("Year of birth over maximum value of " + max + "!");
    }

    private void validateSocialSecurityNumber() {
        if (!SsnValidator.isValid(socialSecurityNumber)) throw new IllegalArgumentException("Social security number invalid!");
    }
}
