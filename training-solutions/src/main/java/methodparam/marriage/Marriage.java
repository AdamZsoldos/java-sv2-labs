package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    private Marriage() {
        throw new IllegalStateException("Utility class");
    }

    public static void getMarried(Person person1, MarriageNameConvention mnc1, Person person2, MarriageNameConvention mnc2) {
        LocalDate date = LocalDate.now();
        person1.addMarriageDate(date);
        person2.addMarriageDate(date);
        String name1 = person1.getName();
        String name2 = person2.getName();
        person1.changeName(getMarriedName(name1, name2, mnc1));
        person2.changeName(getMarriedName(name2, name1, mnc2));
    }

    private static String getMarriedName(String name, String partnerName, MarriageNameConvention mnc) {
        if (mnc == null) return null;
        return switch (mnc) {
            case HYPHEN_NAME -> getHyphenName(name, partnerName);
            case BRIDAL_NAME -> getBridalName(partnerName);
            case SEMI_BRIDAL_NAME -> getSemiBridalName(name, partnerName);
            default -> null;
        };
    }

    private static String getHyphenName(String name, String partnerName) {
        return getSurname(name) + "-" + getSurname(partnerName) + " " + getGivenName(name);
    }

    private static String getBridalName(String partnerName) {
        return partnerName + "né";
    }

    private static String getSemiBridalName(String name, String partnerName) {
        return getSurname(partnerName) + "né " + name;
    }

    private static String getSurname(String name) {
        return name.split(" ")[0];
    }

    private static String getGivenName(String name) {
        String[] parts = name.split(" ");
        return parts[parts.length - 1];
    }
}
