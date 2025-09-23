import java.util.Scanner;

public class SplitWordsCompare {
    public static String[] manualSplit(String str) {
        str = str.trim();
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start);
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.trim().split("\\s+");
        System.out.println("\nManual Split Words:");
        for (String word : manualWords) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("\nComparison Result: " + compareArrays(manualWords, builtInWords));
        sc.close();
    }
}