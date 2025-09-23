import java.util.Scanner;

public class StringLengthDemo {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int manualLength = findLength(text);
        int builtInLength = text.length();
        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);

        if (manualLength == builtInLength) {
            System.out.println(" Both methods give the same result");
        } else {
            System.out.println("Results are different");
        }

        sc.close();
    }
}