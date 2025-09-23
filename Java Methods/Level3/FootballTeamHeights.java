import java.util.Random;

public class FootballTeamHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }
        return heights;
    }
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Players' Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}