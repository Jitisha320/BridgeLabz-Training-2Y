import java.util.Scanner;

public class NumberCheck {

    // Method to return -1 for negative, 0 for zero, 1 for positive
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Getting result from method
        int result = checkNumber(number);

        // Displaying result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}