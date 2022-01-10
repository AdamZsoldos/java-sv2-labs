package collectionsequalshash.company;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Coca Cola", "1234"));
        companies.add(new Company("Yamaha", "2345"));
        companies.add(new Company("Volkswagen", "3456"));
        System.out.println(companies.contains(new Company("Coca Cola", "1234")));
        System.out.println(companies.contains(new Company("Yamaha", "2345")));
        System.out.println(companies.contains(new Company("Volkswagen", "3456")));
        System.out.println(companies.contains(new Company("Yamahb", "2345")));
        System.out.println(companies.contains(new Company("Yamaha", "2346")));
    }
}
