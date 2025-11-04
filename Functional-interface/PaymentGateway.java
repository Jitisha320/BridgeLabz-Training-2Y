interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated.");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        paytm.pay(500);
        paytm.refund(200);
    }
}