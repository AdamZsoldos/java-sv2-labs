package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

        for (String arg : args) System.out.println(processCommandLineArgument(arg));
    }

    private static String processCommandLineArgument(String arg) {
        return switch (arg) {
            case "/list" -> "Listázás";
            case "/add" -> "Hozzáadás";
            case "/delete" -> "Törlés";
            default -> "Ismeretlen művelet";
        };
    }
}
