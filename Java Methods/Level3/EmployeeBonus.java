import java.util.Random;

public class EmployeeBonus {
    public static double[][] generateSalaryAndService() {
        double[][] empData = new double[10][2];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            empData[i][0] = 10000 + rand.nextInt(90000); 
            empData[i][1] = rand.nextInt(10) + 1;       
        }

        return empData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] empData) {
        double[][] newData = new double[10][2]; 
        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            newData[i][0] = salary + bonus; 
            newData[i][1] = bonus;          
        }
        return newData;
    }

    // Method to display summary
    public static void displaySummary(double[][] empData, double[][] newData) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n", "EmpID", "OldSalary", "Years", "Bonus", "NewSalary");
        for (int i = 0; i < empData.length; i++) {
            double oldSalary = empData[i][0];
            double years = empData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            System.out.printf("%-10d %-12.2f %-12.0f %-12.2f %-12.2f%n", i+1, oldSalary, years, bonus, newSalary);
            sumOld += oldSalary;
            sumNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("\nTotal Old Salary: " + sumOld);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + sumNew);
    }

    public static void main(String[] args) {
        double[][] empData = generateSalaryAndService();
        double[][] newData = calculateNewSalaryAndBonus(empData);
        displaySummary(empData, newData);
    }
}