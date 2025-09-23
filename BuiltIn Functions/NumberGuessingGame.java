import java.util.*;
public class NumberGuessingGame {
    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (low/high/correct): ");
            String feedback = sc.next();
            if (feedback.equalsIgnoreCase("low")) low = guess + 1;
            else if (feedback.equalsIgnoreCase("high")) high = guess - 1;
            else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed it!");
                break;
            }
        }
    }
}