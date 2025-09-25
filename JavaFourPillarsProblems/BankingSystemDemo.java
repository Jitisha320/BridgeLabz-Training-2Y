abstract class BankAccount {
    // Encapsulated fields (private)
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Getters and setters (encapsulation)
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    protected void setBalance(double balance) { this.balance = balance; }

    // Concrete methods
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// Interface for loan-related operations
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings account subclass
class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; // 4% interest

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account " + getAccountNumber() + 
                " applied for loan of " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;
    }
}

// Current account subclass
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }
}

// Main class to demonstrate polymorphism
public class BankingSystemDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingsAccount("S001", "Alice", 5000);
        accounts[1] = new CurrentAccount("C001", "Bob", 3000);
        accounts[2] = new SavingsAccount("S002", "Charlie", 800);

        // Process accounts dynamically
        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());

            // Deposit and Withdraw
            acc.deposit(1000);
            acc.withdraw(500);

            // Calculate interest dynamically
            System.out.println("Interest: " + acc.calculateInterest());

            // Check loan eligibility (only for Loanable)
            if (acc instanceof Loanable loanAcc) {
                System.out.println("Loan Eligible? " + loanAcc.calculateLoanEligibility());
                loanAcc.applyForLoan(2000);
            }

            System.out.println("---------------------------");
        }
    }
}