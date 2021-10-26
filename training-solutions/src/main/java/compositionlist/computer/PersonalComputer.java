package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private final List<Hardware> hardware = new ArrayList<>();
    private final List<Software> software = new ArrayList<>();
    private final Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Hardware> getHardware() {
        return hardware;
    }

    public List<Software> getSoftware() {
        return software;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void addHardware(Hardware hardware) {
        this.hardware.add(hardware);
    }

    public void addSoftware(Software software) {
        this.software.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer{" + "\n" +
                "hardware=" + hardware + ",\n" +
                "software=" + software + ",\n" +
                "cpu=" + cpu + "\n" +
                '}';
    }
}
