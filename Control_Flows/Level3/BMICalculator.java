import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        
        double heightM = heightCm / 100.0;

        
        double bmi = weight / (heightM * heightM);

       
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display results
        System.out.printf("BMI: %.2f kg/m²\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}