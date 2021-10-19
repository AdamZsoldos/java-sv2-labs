package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return (username.length() != 0) && !username.contains(" ");
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.equals(password2) && (password1.length() >= 8) && !password1.contains(" ");
    }

    public boolean isValidEmail(String email) {
        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");
        return (atPosition >= 1) && (dotPosition >= atPosition + 2) && (dotPosition <= email.length() - 2) && !email.contains(" ");
    }
}
