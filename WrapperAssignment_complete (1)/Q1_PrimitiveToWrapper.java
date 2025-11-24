import java.util.Scanner;

public class Q1_PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        Integer numberObject = Integer.valueOf(number);
        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object value: " + numberObject);
    }
}
