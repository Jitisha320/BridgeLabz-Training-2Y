public class Q15_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {50, null, 40, null, 60};
        int nullCount = 0, total = 0;
        for (Integer score : scores) {
            if (score == null) {
                nullCount++;
            } else {
                total += score;
            }
        }
        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid score: " + total);
    }
}
