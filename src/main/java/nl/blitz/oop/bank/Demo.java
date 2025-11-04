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
        BankAccount acc1 = new BankAccount("Anne", 1000.0);
        BankAccount acc2 = new BankAccount("Vera", 5000.0);
        BankAccount acc3 = new BankAccount("Jack", 4000.0);

        acc1.deposit(250.5);
        acc2.deposit(200.0);
        acc3.deposit(50.0);

        acc1.withdraw(350.0);
        acc2.withdraw(50.0);
        acc3.withdraw(20.0);

        System.out.println(acc1.printSummary());
        System.out.println(acc2.printSummary());
        System.out.println(acc3.printSummary());
    }
}


