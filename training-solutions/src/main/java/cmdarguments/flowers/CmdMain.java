package cmdarguments.flowers;

public class CmdMain {

    public static void main(String[] args) {

        System.out.println("This application received " + args.length + " command line argument(s).");

        for (int i = 0; i < args.length; i++) System.out.println("Command line argument #" + (i + 1) + ": " + args[i]);
    }
}
