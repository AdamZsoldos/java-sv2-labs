package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder result = new StringBuilder();
        for (String billItem : billItems) {
            if (!result.isEmpty()) { result.append('\n'); }
            result.append(formatBillItem(billItem));
        }
        return result.toString();
    }

    private String formatBillItem(String billItem) {
        String[] parts = billItem.split(";");
        String name = parts[0];
        int price = Integer.parseInt(parts[1]);
        int amount = Integer.parseInt(parts[2]);
        return String.format("%s, %d * %d = %d Ft", name, amount, price, amount * price);
    }
}
