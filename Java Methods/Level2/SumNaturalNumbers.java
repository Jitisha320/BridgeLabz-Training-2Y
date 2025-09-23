import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a valid natural number!");
            return;
        }

        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        System.out.println("Sum using Recursion: " + sumRec);
        System.out.println("Sum using Formula: " + sumForm);
        System.out.println("Both results are equal: " + (sumRec == sumForm));

        sc.close();
    }
}