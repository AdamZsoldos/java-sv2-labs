package compositionlist.computer;

public class Software {

    private String name;
    private double versionNumber;

    public Software(String name, double versionNumber) {
        this.name = name;
        this.versionNumber = versionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(double versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", versionNumber=" + versionNumber +
                '}';
    }
}
