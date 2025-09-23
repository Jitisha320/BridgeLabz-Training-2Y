import java.util.Random;

public class StudentScoreCard {
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + random.nextInt(61); 
            }
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3]; // total, average, percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((average)); // rounding

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R"; // Remedial
        }
        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int students = 5; 
        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScoreCard(scores, stats, grades);
    }
}