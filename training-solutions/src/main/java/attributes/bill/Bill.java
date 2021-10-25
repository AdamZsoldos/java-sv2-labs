package attributes.bill;

public class Bill {

    public static void main(String[] args) {

        BillItem billItem = new BillItem("Cardboard box small", 20, 4, 0.27);

        System.out.println(getItemInfo(billItem));

        billItem.setProduct("Packaging peanut 50g");
        billItem.setPrice(60);
        billItem.setQuantity(2);
        billItem.setVatPercent(0.2);

        System.out.println(getItemInfo(billItem));
    }

    private static String getItemInfo(BillItem billItem) {
        return "Product: " + billItem.getProduct() +
                "\nPrice: " + billItem.getPrice() +
                "\nQuantity: " + billItem.getQuantity() +
                "\nVAT percent: " + billItem.getVatPercent() +
                "\nTotal price: " + billItem.calculateTotalPrice() +
                "\n";
    }
}
