public class Main {
    public static void main(String[] args) {
        // Create account objects
        Account acc1 = new Account("John Doe", "1234567890", "IFSC001", "Main Branch", 1000.0);
        Account acc2 = new Account("Jane Smith", "9876543210", "IFSC002", "City Branch", 2000.0);

        // Use account functions
        System.out.println("John Doe Bank Account Details: \n");
        acc1.displayAccountDetails();
        acc1.displayBalance();
        acc1.creditAmount(500);
        acc1.displayBalance();
        acc1.debitAmount(300);
        acc1.displayBalance();

        System.out.println();
        System.out.println("Jane Smith Bank Account Details: \n");

        acc2.displayAccountDetails();
        acc2.displayBalance();
        acc2.creditAmount(1000);
        acc2.displayBalance();
        acc2.debitAmount(3500); // Should show insufficient balance
        acc2.displayBalance();
    }
}



class Account {
    String accountHolder;
    String accountNumber;
    String ifscCode;
    String branchName;
    double balance;

    // Constructor to initialize account details
    public Account(String accountHolder, String accountNumber, String ifscCode, String branchName, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.balance = initialBalance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Branch Name: " + branchName);
    }

    // Method to credit amount
    public void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " credited successfully.");
        } else {
            System.out.println("Invalid amount to credit.");
        }
    }

    // Method to debit amount
    public void debitAmount(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " debited successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount to debit.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// The code defines a simple banking system with an Account class that allows for account creation, balance management, and transaction operations.
// The main method demonstrates the functionality by creating two accounts and performing various operations on them.