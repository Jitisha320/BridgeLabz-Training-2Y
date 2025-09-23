import java.util.Scanner;

public class CollinearPoints {

    // Method 1: Check collinear using slope formula
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, use cross multiplication
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);
        return slope1 == slope2;
    }

    // Method 2: Check collinear using area of triangle formula
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of 3 points:");

        System.out.print("x1: "); int x1 = sc.nextInt();
        System.out.print("y1: "); int y1 = sc.nextInt();

        System.out.print("x2: "); int x2 = sc.nextInt();
        System.out.print("y2: "); int y2 = sc.nextInt();

        System.out.print("x3: "); int x3 = sc.nextInt();
        System.out.print("y3: "); int y3 = sc.nextInt();

        boolean collinearSlope = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nChecking using slope formula: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Checking using area formula: " + (collinearArea ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}