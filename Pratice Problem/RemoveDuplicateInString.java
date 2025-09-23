import java.util.*;

public class RemoveDuplicateInString {
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String noDuplicates = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + noDuplicates);
    }
}