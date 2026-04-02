package src.com.gla.classes-objects.Level1;


public class ATMSystem {

    String accountHolder;
    int accountNumber;
    double balance;

    ATMSystem(String holder,int number,double balance){
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args){
        ATMSystem acc = new ATMSystem("Ravi",12345,10000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
