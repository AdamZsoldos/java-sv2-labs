package introexceptionthrow;

public class Validate {

    private Validate() {
        throw new IllegalStateException("Utility class");
    }

    public static void validateName(String name) {
        if (name == null) throw new IllegalArgumentException("Name null!");
        if (name.isBlank()) throw new IllegalArgumentException("Name blank!");
    }

    public static void validateAge(String ageString) {
        if (ageString == null) throw new IllegalArgumentException("Age null!");
        if (ageString.isBlank()) throw new IllegalArgumentException("Age blank!");
        int age;
        try { age = Integer.parseInt(ageString); }
        catch (NumberFormatException e) { throw new IllegalArgumentException("Age not a number!"); }
        if (age < 0) throw new IllegalArgumentException("Age below minimum value of 0!");
        if (age > 120) throw new IllegalArgumentException("Age above maximum value of 120!");
    }
}
