import java.util.*;

public class InventoryManagement{
    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        // 1. Add products
        stock.put("Soap", 20);
        stock.put("Shampoo", 10);
        stock.put("Rice", 0);
        stock.put("Oil", 15);

        // 2. Customer buys
        buy(stock, "Soap", 5);
        buy(stock, "Oil", 20);   // quantity becomes 0 → out of stock
        buy(stock, "Shampoo", 3);

        // 3. New shipment
        restock(stock, "Rice", 25);
        restock(stock, "Shampoo", 10);

        // 4. Query product
        query(stock, "Rice");
        query(stock, "Oil");

        // Print all out-of-stock products
        System.out.println("\nOut of Stock Products:");
        stock.forEach((p, q) -> { if (q == 0) System.out.println(p); });
    }

    static void buy(Map<String, Integer> stock, String product, int qty) {
        int current = stock.getOrDefault(product, 0);
        current -= qty;
        if (current <= 0) {
            stock.put(product, 0);
            System.out.println(product + " is now OUT OF STOCK");
        } else {
            stock.put(product, current);
        }
    }

    static void restock(Map<String, Integer> stock, String product, int qty) {
        stock.put(product, stock.getOrDefault(product, 0) + qty);
    }

    static void query(Map<String, Integer> stock, String product) {
        if (stock.containsKey(product))
            System.out.println(product + " remaining: " + stock.get(product));
        else
            System.out.println(product + " not stocked");
    }
}
