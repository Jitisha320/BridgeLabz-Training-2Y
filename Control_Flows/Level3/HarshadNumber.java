import java.util.*;


public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int sumOfDigits = 0;
        int temp = number;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}