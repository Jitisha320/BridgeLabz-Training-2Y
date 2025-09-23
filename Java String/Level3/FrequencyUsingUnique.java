import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] findUniqueChars(String text) {
        int n = text.length();
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = text.charAt(i);
            }
        }
        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    static void findFrequency(String text) {
        char[] unique = findUniqueChars(text);

        for (char ch : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " → " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        findFrequency(text);
    }
}