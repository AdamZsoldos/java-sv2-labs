package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Jane Doe");
        client.setYear(1980);
        client.setAddress("1200 Example Way");

        System.out.println("Name: " + client.getName());
        System.out.println("Year of birth: " + client.getYear());
        System.out.println("Home address: " + client.getAddress());

        client.migrate("1600 Apple Road");
        System.out.println("Migration successful!");
        System.out.println("New home address: " + client.getAddress());

    }

}
