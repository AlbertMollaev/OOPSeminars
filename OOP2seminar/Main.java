package OOP2seminar;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human visitor1 = new Human("Антон");
        // Human visitor2 = new Human("Иван");
        // Human visitor3 = new Human("Илья");
        System.out.println();
        market.acceptToMarket(visitor1);
        market.update();
        // System.out.println();
        // market.acceptToMarket(visitor2);
        // market.update();
        // System.out.println();
        // market.acceptToMarket(visitor3);
        // market.update();


    }
}
