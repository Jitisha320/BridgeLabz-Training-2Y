import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month for non-leap year
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check if a year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1];
    }

    // Get first day of the month (0=Sunday, 1=Monday,...)
    public static int getFirstDay(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int day = (1 + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        return (day + 6) % 7; // Adjust: 0=Sunday
    }

    // Print calendar
    public static void printCalendar(int month, int year) {
        System.out.println("     " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        // Print spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}