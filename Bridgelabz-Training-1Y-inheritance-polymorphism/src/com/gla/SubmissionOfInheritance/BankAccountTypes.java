package.src.com.gla.SubmissionOfInheritance;

class BankAccount{int acc;double bal;}
class SavingsAccount extends BankAccount{}
class CheckingAccount extends BankAccount{}
class FixedDepositAccount extends BankAccount{}
public class BankAccountTypes{public static void main(String[] args){SavingsAccount s=new SavingsAccount();s.acc=101;s.bal=10000;System.out.println("Savings Account");}}