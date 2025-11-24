import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {
            "Amit", "Riya", "Amit", "Karan", "Riya",
            "Amit", "Karan", "Riya", "Amit", "Riya"
        };

        // Count votes
        for (String c : castVotes)
            votes.put(c, votes.getOrDefault(c, 0) + 1);

        // Print results
        System.out.println("Vote Count:");
        votes.forEach((name, v) -> System.out.println(name + " : " + v));

        // Highest votes
        var winner = votes.entrySet().stream()
                          .max(Map.Entry.comparingByValue()).get();

        System.out.println("\nWinner: " + winner.getKey() + " with " + winner.getValue() + " votes");
    }
}
