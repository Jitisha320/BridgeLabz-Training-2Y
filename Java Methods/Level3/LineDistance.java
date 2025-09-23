import java.util.Scanner;

public class LineDistance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find equation of line: returns [slope, yIntercept]
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: "); double x1 = sc.nextDouble();
        System.out.print("Enter y1: "); double y1 = sc.nextDouble();
        System.out.print("Enter x2: "); double x2 = sc.nextDouble();
        System.out.print("Enter y2: "); double y2 = sc.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] equation = lineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance between points: " + distance);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);

        sc.close();
    }
}