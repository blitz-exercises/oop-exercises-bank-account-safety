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
        BankAccount b1 =  new BankAccount("Dimitri", 15);
        BankAccount b2 =  new BankAccount("Rens", 100);
        BankAccount b3 =  new BankAccount("Jeroen", 2500);

        b1.deposit(100);
        b2.withdraw(5);
        b3.withdraw(1250);

        System.out.println(b1.printSummary());
        System.out.println(b2.printSummary());
        System.out.println(b3.printSummary());
    }
}

