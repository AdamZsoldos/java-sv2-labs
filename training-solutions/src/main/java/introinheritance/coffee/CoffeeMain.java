package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Tchibo");
        coffee.setPrice(500);
        System.out.println(coffee.getName() + ", " + coffee.getPrice());
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Nescafe");
        cappuccino.setPrice(600);
        System.out.println(cappuccino.getName() + ", " + cappuccino.getPrice());
    }
}
