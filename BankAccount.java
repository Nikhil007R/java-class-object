import java.util.Scanner;

class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrawn $%.2f%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a BankAccount object
        BankAccount account = new BankAccount("Nikhil Rawat", "2110990948", 1000.00);

        boolean running = true; // To keep the loop running

        while (running) {
            // Displaying the menu
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            // Handling user choices using if-else statements
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
            } else if (choice == 3) {
                account.displayBalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                running = false; // Exit the loop
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        sc.close();
    }
}
