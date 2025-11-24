import java.util.*;

public class VisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {"home","about","products","home","products","contact","home"};

        for (String p : pages) {
            visits.put(p, visits.getOrDefault(p, 0) + 1);
        }

        // Sorted by visit count desc
        visits.entrySet().stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .forEach(System.out::println);

        // Most visited
        String most = null;
        int max = -1;
        for (var e : visits.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                most = e.getKey();
            }
        }

        System.out.println("Most Visited: " + most);
    }
}