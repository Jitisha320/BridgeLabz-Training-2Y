public class Q12_BankTransactionLimits {
    public static double remainingLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;
        System.out.println("Limit 1: " + remainingLimit(limit1));
        System.out.println("Limit 2: " + remainingLimit(limit2));
    }
}
