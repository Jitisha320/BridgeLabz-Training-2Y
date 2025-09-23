import java.util.Scanner;

public class PerimeterOfTriangle {

    // Method to calculate number of rounds to complete 5km
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 kilometers in meters
        return (int) Math.ceil(distance / perimeter); // Rounds up to nearest whole round
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for sides of triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Validate triangle inequality
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete needs to complete " + rounds + " round(s) to run 5 kilometers.");
        } else {
            System.out.println("The entered sides do not form a valid triangle.");
        }

        scanner.close();
    }
}