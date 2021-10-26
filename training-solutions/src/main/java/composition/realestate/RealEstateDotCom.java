package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        RealEstate realEstate = new RealEstate("House for sale in suburbs", 20_000_000, new Details("Large family home in suburb area.", new Address("Budapest", "1550", "Jópélda st.", 10), 150, 600));

        System.out.println();
        System.out.println(realEstate);
    }
}
