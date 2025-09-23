import java.util.Scanner;

public class ArrayIndexOutOfBoundDemo {
    public static void generateException(String[] names) {
        System.out.println(names[10]); // Invalid index
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        // generateException(names); // Uncomment to see crash
        handleException(names);
        sc.close();
    }
}