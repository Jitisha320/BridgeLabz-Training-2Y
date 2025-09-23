import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;       
        int J = y / 100;       

        
        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

      
        int dayOfWeek = ((h + 6) % 7);

       
        System.out.println("Day of the week (0=Sunday, 1=Monday, ... 6=Saturday): " + dayOfWeek);

        sc.close();
    }
}