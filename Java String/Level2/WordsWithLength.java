import java.util.Scanner;

public class WordsWithLength {

    public static String[] manualSplit(String str) {
        str = str.trim();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        count++;
        String[] words = new String[count];
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

    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("\nWord\t|\tLength");
        System.out.println("---------------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t|\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordLengthArray(words);
        displayTable(table);

        sc.close();
    }
}