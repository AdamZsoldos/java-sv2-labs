package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {

        Name name1 = new Name("Doe", "M.", "Jane");
        Name name2 = new Name("Debreceni", "", "László", Title.DR);

        System.out.println(name1.concatNameWesternStyle());
        System.out.println(name1.concatNameHungarianStyle());
        System.out.println(name2.concatNameWesternStyle());
        System.out.println(name2.concatNameHungarianStyle());
    }
}
