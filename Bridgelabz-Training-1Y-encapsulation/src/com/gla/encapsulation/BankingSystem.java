package com.gla.encapsulation;


interface Loanable {
    void applyForLoan();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int acc, String name, double bal) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = bal;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }
    public double calculateInterest() {
        return getBalance() * 0.05;
    }
    public void applyForLoan() {
        System.out.println("Loan Applied");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(101, "Ravi", 10000);
        acc.deposit(5000);
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
