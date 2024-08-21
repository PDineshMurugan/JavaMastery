package Inhertitance.Bank;

public class Savingsacc extends BankAccount {
    int minimumBalance;

    Savingsacc() {
        this.minimumBalance = 500;
    }

    public double withdraw(double amount) {
        double balance = super.balance;
        if (amount <= (balance + 500))
            return super.balance - amount;
        else {
            System.out.println("Low Balance");
        }
        System.out.println("Your Balance:");
        return balance;
    }
}
