package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(3.68, true);

        System.out.println("Distance in km: " + distance.getDistanceInKm());
        System.out.println("Exact: " + distance.isExact());

        int i = (int) distance.getDistanceInKm();
        System.out.println("Distance in km (int): " + i);
    }
}
