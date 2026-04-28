package src.com.gla.Scenario-Based-Problems;

class Account {
    int accountNumber;
    double balance;
    static String bankName="ABC Bank";

    Account(int acc,double bal) {
        accountNumber=acc;
        balance=bal;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int acc,double bal) {
        super(acc,bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int acc,double bal) {
        super(acc,bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        Account a;

        a = new SavingsAccount(101,10000);
        System.out.println("Savings Interest: " + a.calculateInterest());

        a = new CurrentAccount(102,10000);
        System.out.println("Current Interest: " + a.calculateInterest());
    }
}
