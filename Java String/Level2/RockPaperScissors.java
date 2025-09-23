import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            System.out.println("Computer chose: " + comp);

            String result = findWinner(user, comp);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) compWins++;
            else draws++;

            System.out.println("Result: " + result);
        }

        System.out.println("\n----- Final Stats -----");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        double userPercent = (userWins * 100.0) / rounds;
        double compPercent = (compWins * 100.0) / rounds;
        System.out.printf("User Win Percentage: %.2f%%\n", userPercent);
        System.out.printf("Computer Win Percentage: %.2f%%\n", compPercent);

        sc.close();
    }
}