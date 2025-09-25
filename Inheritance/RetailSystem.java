class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking No: " + trackingNumber;
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate;
    }
}

public class RetailSystem {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder(101, "2025-09-15", "TRK12345", "2025-09-20");
        System.out.println(d1.getOrderStatus());
    }
}