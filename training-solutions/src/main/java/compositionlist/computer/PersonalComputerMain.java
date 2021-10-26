package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        PersonalComputer pc = new PersonalComputer(new Cpu("Intel Core i9", 3.7));

        pc.addHardware(new Hardware("RAM", "DDR4 16 GB"));
        pc.addHardware(new Hardware("GPU", "GeForce GTX 970"));

        pc.addSoftware(new Software("Windows 10 Pro", 20.0));
        pc.addSoftware(new Software("IntelliJ IDEA", 11.0));

        System.out.println("pc=" + pc);
    }
}
