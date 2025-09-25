interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class: Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: getters & setters
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics.";
    }
}

// Subclass: Clothing
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "5% GST applied on Clothing.";
    }
}

// Subclass: Groceries
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    // Groceries are tax-free in this example
    public double calculateTax() {
        return 0;
    }

    public String getTaxDetails() {
        return "No tax on Groceries.";
    }
}

// Main class to demonstrate Polymorphism
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics("E101", "Laptop", 60000);
        products[1] = new Clothing("C202", "T-Shirt", 1000);
        products[2] = new Groceries("G303", "Rice Bag", 1500);

        for (Product p : products) {
            System.out.println("\n---------------------------");
            p.displayDetails();
            double discount = p.calculateDiscount();

            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax applicable.");
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
        }
    }
}