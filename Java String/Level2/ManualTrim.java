import java.util.Scanner;

public class ManualTrim {

    public static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        String manualTrim = trimSpaces(text);
        String builtInTrim = text.trim();

        System.out.println("Manual Trim: '" + manualTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Same Result: " + manualTrim.equals(builtInTrim));

        sc.close();
    }
}