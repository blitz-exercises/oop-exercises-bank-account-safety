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
    // TODO: make these fields private (holder immutable, balance mutable)
    private final String holder;
    private double balance;

    /**  
     * TODO:
     * - Validate inputs
     *   - holder non-null/non-blank
     *   - initialBalance >= 0
     * - Throw IllegalArgumentException if invalid
     * - Otherwise, assign to fields
     */
    public BankAccount(String holder, double initialBalance) {
        // throw new UnsupportedOperationException("TODO: implement constructor validation and assignment");
        if (holder == null || holder.isBlank() || holder.isEmpty()) {
            throw new IllegalArgumentException("Holder cannot be empty");
        }
        this.holder = holder;

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot start negative");
        }
        this.balance = initialBalance;
    }

    // TODO: return account holder name
    public String getHolder() {
        // throw new UnsupportedOperationException("TODO: implement getHolder()");
        return this.holder;
    }

    // TODO: return current balance
    public double getBalance() {
        // throw new UnsupportedOperationException("TODO: implement getBalance()");
        return this.balance;
    }

    /**
     * TODO:
     * Deposit a positive amount.
     * - amount must be > 0, otherwise throw IllegalArgumentException
     * - add amount to balance
     */
    public void deposit(double amount) {
        // throw new UnsupportedOperationException("TODO: implement deposit()");
        if (amount < 0) {
            throw new IllegalArgumentException("deposit has to be a positive amount");
        }
        double new_balance = this.balance + amount;
        this.balance = new_balance;
    }

    /**
     * TODO:
     * Withdraw a valid amount.
     * - amount > 0
     * - amount <= balance
     * - update balance
     * - otherwise throw IllegalArgumentException
     */
    public void withdraw(double amount) {
        // throw new UnsupportedOperationException("TODO: implement withdraw()");
        if (amount <= 0) {
            throw new IllegalArgumentException("Not a valid withdraw amount");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("There are not enough funds in the account");
        }
        double new_balance = this.balance - amount;
        this.balance = new_balance;
    }

    /**
     * TODO:
     * Return a string like:
     * "Account: {holder} | Balance: {balance}"
     */
    public String printSummary() {
        // throw new UnsupportedOperationException("TODO: implement printSummary()");
        return "Account: " + this.holder + " | Balance: " + this.balance;
    }
}

