abstract class FoodItem {
    // Encapsulated fields
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters (encapsulation)
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println(itemName + " | Quantity: " + quantity + " | Price per item: " + price);
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Interface for discount
interface Discountable {
    void applyDiscount(double percent);
    double getDiscountDetails();
}

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total -= total * discount; // apply discount
        return total;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent / 100.0;
        }
    }

    @Override
    public double getDiscountDetails() {
        return discount * 100; // percentage
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0.0;
    private double extraCharge = 50.0; // extra charge per non-veg item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        total -= total * discount; // apply discount
        return total;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent / 100.0;
        }
    }

    @Override
    public double getDiscountDetails() {
        return discount * 100; // percentage
    }
}

// Main class to demonstrate polymorphism
public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[3];

        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Curry", 250, 1);
        order[2] = new VegItem("Salad", 100, 3);

        // Apply discount on VegItem
        if (order[0] instanceof Discountable d1) d1.applyDiscount(10); // 10% discount
        if (order[1] instanceof Discountable d2) d2.applyDiscount(5);  // 5% discount

        double grandTotal = 0.0;

        // Polymorphic processing
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable discountable) {
                System.out.println("Discount Applied: " + discountable.getDiscountDetails() + "%");
            }
            System.out.println("-------------------------");
            grandTotal += item.calculateTotalPrice();
        }

        System.out.println("Grand Total of Order: " + grandTotal);
    }
}