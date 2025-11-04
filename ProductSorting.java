import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | ₹" + price + " | " + rating;
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2500, 4.3),
            new Product("Watch", 4500, 4.8),
            new Product("Bag", 1500, 4.0)
        );

        System.out.println("\nSort by Price (Low to High):");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating (High to Low):");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);
    }
}