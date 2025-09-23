import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Height (cm): ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            bmiStatus[i] = status;
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        System.out.println("--------------------------------------------------------------");

        sc.close();
    }
}