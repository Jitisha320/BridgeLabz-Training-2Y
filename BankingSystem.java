import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        // 1. HashMap to store accountNumber → balance
        HashMap<String, Double> accounts = new HashMap<>();

        // 1. Add new customers with initial balance
        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 8000.0);
        accounts.put("ACC104", 3000.0);
        accounts.put("ACC105", 15000.0);

        // 2. Deposit operation
        deposit(accounts, "ACC104", 2000);  // Increase balance of ACC104
        deposit(accounts, "ACC101", 1000);

        // 2. Withdrawal operation with balance check
        withdraw(accounts, "ACC103", 3000);    
        withdraw(accounts, "ACC104", 7000);    // Should show insufficient balance

        // 3. Print all customers sorted by descending balance
        System.out.println("\n--- Customers Sorted by Balance (High → Low) ---");
        accounts.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // 4. Top 3 customers with highest balance
        System.out.println("\n--- Top 3 Customers ---");
        accounts.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }

    // Deposit method
    public static void deposit(HashMap<String, Double> accounts, String accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            accounts.put(accNo, accounts.get(accNo) + amount);
            System.out.println("Deposited " + amount + " to " + accNo);
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    // Withdrawal method
    public static void withdraw(HashMap<String, Double> accounts, String accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            double balance = accounts.get(accNo);

            if (amount <= balance) {
                accounts.put(accNo, balance - amount);
                System.out.println("Withdrawn " + amount + " from " + accNo);
            } else {
                System.out.println("Insufficient balance for " + accNo + " (Available: " + balance + ")");
            }
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }
}
