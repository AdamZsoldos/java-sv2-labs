package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Lipton", 300);
        System.out.println(tea.getName() + ", " + tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("Twinings", 350);
        System.out.println(herbalTea.getName() + ", " + herbalTea.getPrice());
    }
}
