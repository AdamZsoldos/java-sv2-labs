package introexceptionthrow.patient;

public class SsnValidator {

    private SsnValidator() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValid(String ssn) {
        if (ssn.length() != 9) return false;
        if (!Character.isDigit(ssn.charAt(8))) return false;
        int sum = 0;
        for (int i = 0; i < ssn.length(); i++) {
            if (!Character.isDigit(ssn.charAt(i))) return false;
            int number = Integer.parseInt("" + ssn.charAt(i));
            if (i < 8) {
                sum += i % 2 == 0 ? number * 3 : number * 7;
            }
            else if (number != sum % 10) return false;
        }
        return true;
    }
}
