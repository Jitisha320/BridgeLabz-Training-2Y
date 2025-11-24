import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        // 1. Add products in order
        cart.put("Laptop Bag", 1200.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Monitor", 4500.0);
        cart.put("Mouse", 500.0);

        // 5. Remove an item (simulate quantity = 0)
        cart.remove("Mouse");

        // 2. Display in insertion order
        System.out.println("Cart Items:");
        cart.forEach((p, price) -> System.out.println(p + " : ₹" + price));

        // 3. Calculate total bill
        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();

        // 4. Apply 10% discount if total > 5000
        if (total > 5000) total *= 0.90;

        System.out.println("\nFinal Amount: ₹" + total);
    }
}
