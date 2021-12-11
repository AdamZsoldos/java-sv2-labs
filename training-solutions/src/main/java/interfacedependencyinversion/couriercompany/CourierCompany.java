package interfacedependencyinversion.couriercompany;

import java.util.Arrays;
import java.util.List;

public class CourierCompany {

    public static void main(String[] args) {
        List<Box> boxes = Arrays.asList(new SmallBox(), new MediumBox(), new LargeBox(), new ExtraLargeBox());
        for (Box box : boxes) {
            System.out.println(box.getSize() + " - " + box.getPrice() + " Ft");
        }
    }
}
