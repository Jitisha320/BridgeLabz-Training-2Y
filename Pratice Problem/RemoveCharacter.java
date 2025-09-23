import java.util.Scanner;

public class RemoveCharacter {
    static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeChar(str, ch));
        sc.close();
    }
}