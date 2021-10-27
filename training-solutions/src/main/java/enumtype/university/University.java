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
/*
Gyakorlati feladat - Egyetemek

A university csomagban hozz létre egy University nevű enumot, amelynek példányai néhány, általad tetszőlegesen
választott magyarországi egyetem rövidített neve (pl. BME)! Legyen az enumnak egy String name attribútuma is,
amelynek értékét a konstruktorában állítsa be: ez legyen minden példánynál az adott egyetem hivatalos neve,
rövidítések nélkül kiírva. Teszteld a UniversityMain osztály main() metódusában!
 */