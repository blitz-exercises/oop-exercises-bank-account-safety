package nl.blitz.oop.bank;

public class BankAccount {
    private final String holder;
    private double balance;

    public BankAccount(String holder, double initialBalance) {
        if (holder == null || holder.isBlank()) {
            throw new IllegalArgumentException("holder cannot be null or blank");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("initialBalance must be >= 0");
        }
        this.holder = holder;
        this.balance = initialBalance;
    }


    public String getHolder() {
        return holder;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {throw new IllegalArgumentException("amount must be > 0");}
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {throw new IllegalArgumentException("amount must be > 0");}
        if (amount > balance) {throw new IllegalArgumentException("amount must be <= balance");}
        balance -= amount;
    }

    public String printSummary() {
        return "Account: " + holder + " | Balance: " + balance;
    }
}

