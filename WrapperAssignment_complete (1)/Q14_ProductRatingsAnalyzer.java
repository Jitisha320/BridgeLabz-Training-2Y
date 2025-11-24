import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Q14_ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) {
            allRatings.add(r);
        }
        allRatings.addAll(newRatings);

        int sum = 0, count = 0;
        for (Integer rating : allRatings) {
            if (Objects.nonNull(rating)) {
                sum += rating;
                count++;
            }
        }
        double average = count == 0 ? 0.0 : (double) sum / count;
        System.out.println("Average rating: " + average);
    }
}
