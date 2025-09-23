import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text, int index) {
        System.out.println("Accessing index " + index + "...");
        System.out.println("Character: " + text.charAt(index)); 
    }
    public static void handleException(String text, int index) {
        try {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Error: Index " + index + " is invalid! Valid range: 0 to " + (text.length() - 1));
        } catch (Exception e) {
            System.out.println("⚠ Some other error occurred: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter an index to access: ");
        int index = sc.nextInt();
        handleException(text, index);
        sc.close();
    }
}