import java.util.Arrays;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return n;
    }
    public static double[] findAverageMinMax(int[] n) {
        double sum = 0;
        int min = n[0];
        int max = n[0];

        for (int num : n) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / n.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomn = generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit n: " + Arrays.toString(randomn));
        double[] result = findAverageMinMax(randomn);
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}