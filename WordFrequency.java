import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "");
        String[] words = sentence.split("\\s+");

        Map<String, Integer> count = new HashMap<>();

        for (String w : words) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }

        System.out.println(count);
    }
}
