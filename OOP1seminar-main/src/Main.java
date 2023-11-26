import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Tea", 250, 90));
        productList.add(new HotDrink("Coffee", 200, 90));
        productList.add(new HotDrink("Water", 250, 90));
        productList.add(new HotDrink("Soup", 350, 80));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct(250, 90));
    }
}