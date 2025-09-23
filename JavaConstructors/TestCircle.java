class Circle {
    double radius;
    Circle() {
        this(1.0); 
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius + ", Area: " + area());
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}