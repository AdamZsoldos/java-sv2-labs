package enumtype.university;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    ELTE("Eötvös Loránd Tudományegyetem"),
    BGE("Budapesti Gazdasági Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
