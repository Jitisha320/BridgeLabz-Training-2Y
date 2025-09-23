import java.util.Scanner;

public class VotingEligibility {

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("\nAge\t|\tEligibility");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t|\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

        String[][] table = checkVotingEligibility(ages);
        displayTable(table);

        sc.close();
    }
}