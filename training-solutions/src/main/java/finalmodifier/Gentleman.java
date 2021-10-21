package finalmodifier;

import java.util.Scanner;

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello and welcome, ";
    public static final String MESSAGE_SUFFIX = "!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gentleman gentleman = new Gentleman();

        System.out.println("What's your name?");
        System.out.println(gentleman.sayHello(scanner.nextLine()));
    }

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name + MESSAGE_SUFFIX;
    }
}
