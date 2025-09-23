import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.print("Positive, ");
                if (isEven(nums[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        int result = compare(nums[0], nums[nums.length - 1]);
        System.out.println("\nComparison of first and last element:");
        if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else if (result > 0) {
            System.out.println("First number is greater.");
        } else {
            System.out.println("Last number is greater.");
        }

        sc.close();
    }
}