import java.util.Scanner;

public class BMICalculator{
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;  
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi <= 18.4)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal";
        else if (bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            result[i][0] = String.format("%.1f", height);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = String.format("%.1f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayResults(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");

        for (String[] row : result) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];  

        System.out.println("Enter Weight (kg) and Height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        System.out.println("\n------ BMI REPORT ------");
        displayResults(result);

        sc.close();
    }
}