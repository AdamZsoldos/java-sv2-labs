package stringseparate;

public class IceCream {

    private String[] flavors;

    public static void main(String[] args) {
        IceCream iceCream = new IceCream(new String[] {"csoki", "vanília", "eper", "citrom", "puncs"});
        System.out.println(iceCream.getFlavorListMarketingPhrase("Ma kapható: ", ". Gyerekeknek féláron!"));
    }

    public IceCream(String[] flavors) {
        this.flavors = flavors;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] flavors) {
        this.flavors = flavors;
    }

    public String getFlavorList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flavors.length; i++) {
            if (i != 0) sb.append(", ");
            sb.append(flavors[i]);
        }
        return sb.toString();
    }

    public String getFlavorListMarketingPhrase(String listPrefix, String listSuffix) {
        return listPrefix + getFlavorList() + listSuffix;
    }
}
