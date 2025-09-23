import java.util.Scanner;

public class CompareString {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        boolean result = compareUsingCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Manual Comparison: " + result);
        System.out.println("Built-in equals() Result: " + equalsResult);

        if (result == equalsResult) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Methods give different results");
        }
        sc.close();
    }
}