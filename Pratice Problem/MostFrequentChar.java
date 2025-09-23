import java.util.Scanner;

public class MostFrequentChar {
    static char findMostFrequent(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (char ch : str.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Most Frequent Character: " + findMostFrequent(str));
        sc.close();
    }
}