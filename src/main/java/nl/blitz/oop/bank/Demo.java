package nl.blitz.oop.bank;

/**
 * Demo program for BankAccount.
 * 
 * TODO:
 * - Create at least three valid BankAccount objects
 * - Perform deposits and withdrawals
 * - Print summaries using printSummary()
 * - Optionally calculate total balance using getBalance()
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Harry", 50);
        BankAccount account2 = new BankAccount("Frans", 100);
        BankAccount account3 = new BankAccount("Tom", 150);

        // Account1 actions
        System.out.println(account1.printSummary());
        account1.deposit(40);
        System.out.println("Current Balance: " + account1.getBalance());
        account1.withdraw(35);
        System.out.println(account1.printSummary());

        // Account2 actions
        System.out.println(account2.printSummary());
        account2.deposit(10);
        System.out.println("Current Balance: " + account2.getBalance());
        account2.withdraw(35);
        System.out.println(account2.printSummary());

        // Account3 actions
        System.out.println(account3.printSummary());
        account3.deposit(400);
        System.out.println("Current Balance: " + account3.getBalance());
        account3.withdraw(35);
        System.out.println(account3.printSummary());
        
        // throw new UnsupportedOperationException("TODO: implement demo logic");
    }
}

