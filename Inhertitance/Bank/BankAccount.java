package Inhertitance.Bank;

import java.util.*;

public class BankAccount {
    long accountNumber;
    double balance;
    float interestRate;

    BankAccount() {
        this.balance = 2000;
    }

    BankAccount(long accountNumber, double balance, float interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;

    }

    public double deposite(double amount) {
        return balance = balance + amount;
    }

    // main
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Savingsacc save = new Savingsacc();
        System.out.println("1.Deposite\n2.Withdraw");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println("Enter the amount to deposite:");
                double amount = sc.nextInt();
                System.out.println(bank.deposite(amount));
                break;
            }
            case 2: {
                System.out.println("Enter the amount to withdraw:");
                double amount = sc.nextInt();
                System.out.println(save.withdraw(amount));
                break;
            }

            default:
                break;
        }
        sc.close();
        ;
    }
}
