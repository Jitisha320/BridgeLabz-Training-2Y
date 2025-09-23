import java.util.Scanner;

public class CalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Perform calculation based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        sc.close();
    }
}