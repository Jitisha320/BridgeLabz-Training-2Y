import java.util.Scanner;

public class ToggleCase {
    static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Toggled String: " + toggleCase(str));
        sc.close();
    }
}