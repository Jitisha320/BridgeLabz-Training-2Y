class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int term; // in months

    FixedDepositAccount(int accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account for Term: " + term + " months");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 50000, 5.5);
        CheckingAccount ca = new CheckingAccount(1002, 30000, 20000);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 100000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}