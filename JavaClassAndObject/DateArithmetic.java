
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("After Adding 7 Days, 1 Month & 2 Years: " + newDate);
        System.out.println("Final Date after Subtracting 3 Weeks: " + finalDate);

        sc.close();
    }
}