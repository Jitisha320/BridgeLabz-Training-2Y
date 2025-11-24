import java.util.ArrayList;
import java.util.List;

public class Q16_StudentMarksReport {
    public static void main(String[] args) {
        String[] marksData = {"85", "95", "null", "88", "abc"};
        List<Integer> validMarks = new ArrayList<>();

        for (String mark : marksData) {
            try {
                if (!mark.equalsIgnoreCase("null")) {
                    validMarks.add(Integer.parseInt(mark));
                }
            } catch (NumberFormatException e) {
            }
        }

        int sum = 0;
        for (int m : validMarks) sum += m;
        double average = validMarks.isEmpty() ? 0.0 : (double) sum / validMarks.size();

        System.out.println("Average marks: " + average);
    }
}
