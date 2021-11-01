package junit5;

public class Gentleman {

    public String sayHello(String name) {
        if (name == null || name.isBlank()) {
            return "Hello Anonymous!";
        }
        return String.format("Hello %s!", name);
    }
}
