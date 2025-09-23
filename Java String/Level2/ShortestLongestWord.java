import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitWords(String str) {
        str = str.trim();
        return str.split("\\s+");
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Shortest Word: " + shortest + " (" + shortest.length() + ")");
        System.out.println("Longest Word: " + longest + " (" + longest.length() + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        findShortestLongest(words);

        sc.close();
    }
}