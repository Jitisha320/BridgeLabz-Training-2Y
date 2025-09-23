import java.util.Scanner;

public class MarksGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter marks in Physics (out of 100): ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks in Chemistry (out of 100): ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks in Maths (out of 100): ");
        double maths = sc.nextDouble();

       
        double total = physics + chemistry + maths;
        double percentage = total / 3;

        
        String grade, remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }

}