import java.util.function.Predicate;
class Notification {
    String type;
    String message;

    Notification(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        Notification n1 = new Notification("Critical", "Patient heart rate abnormal!");
        Notification n2 = new Notification("Info", "Scheduled check-up at 5 PM");
        Notification n3 = new Notification("Warning", "Low oxygen level detected");

        Predicate<Notification> isCritical = n -> n.type.equals("Critical");

        System.out.println("Critical Alerts:");

        if (isCritical.test(n1)) {
            System.out.println(n1);
        }
        if (isCritical.test(n2)) {
            System.out.println(n2);
        }
        if (isCritical.test(n3)) {
            System.out.println(n3);
        }
    }
}