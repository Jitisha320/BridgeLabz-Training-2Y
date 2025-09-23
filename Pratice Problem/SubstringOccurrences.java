import java.util.Scanner;

public class SubstringOccurrences {
    static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub);
        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + sub.length());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(str, sub));
        sc.close();
    }
}