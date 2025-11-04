package nl.blitz.oop.bank;

/**
 * BankAccount enforces safe updates to the balance through validated operations.
 * 
 * Rules to implement:
 * - holder: non-null, non-blank
 * - initialBalance: >= 0
 * - deposit(amount): amount > 0
 * - withdraw(amount): amount > 0 and amount <= balance
 * - Fields are private (no public setters)
 * - printSummary(): "Account: {holder} | Balance: {balance}"
 */
public class BankAccount {
    // Fields: holder immutable, balance mutable
    private final String holder;
    private double balance;

    /**
     * Constructs a BankAccount after validating inputs.
     * 
     * @param holder         the account holder's name (non-null, non-blank)
     * @param initialBalance the starting balance (>= 0)
     * @throws IllegalArgumentException if inputs are invalid
     */
    public BankAccount(String holder, double initialBalance) {
        if (holder == null || holder.isBlank()) {
            throw new IllegalArgumentException("Holder cannot be null or blank.");
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.holder = holder;
        this.balance = initialBalance;
    }

    // Return account holder name
    public String getHolder() {
        return holder;
    }

    // Return current balance
    public double getBalance() {
        return balance;
    }

    /**
     * Deposit a positive amount.
     * 
     * @param amount must be > 0
     * @throws IllegalArgumentException if amount <= 0
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    /**
     * Withdraw a valid amount.
     * 
     * @param amount must be > 0 and <= balance
     * @throws IllegalArgumentException if invalid
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        balance -= amount;
    }

    /**
     * Return a string summary of the account.
     * 
     * @return summary string: "Account: {holder} | Balance: {balance}"
     */
    public String printSummary() {
        return "Account: " + holder + " | Balance: " + balance;
    }
}
