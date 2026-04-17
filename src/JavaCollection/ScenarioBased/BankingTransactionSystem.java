package JavaCollection.ScenarioBased;
import java.util.*;
class Transaction{
    int id;
    String accountId;
    double amount;
    Transaction(int id,String accountId,double amount){
        this.id=id;
        this.accountId=accountId;
        this.amount=amount;
    }
    public String toString(){
        return id+" "+accountId+" "+amount;
    }
}
class Account{
    String id;
    Account(String id){
        this.id=id;
    }
    public int hashCode(){
        return id.hashCode();
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Account a=(Account)o;
        return id.equals(a.id);
    }
}
public class BankingTransactionSystem{
    public static void main(String[] args){
        List<Transaction> all=new ArrayList<>();

        Set<Account> accounts=new HashSet<>();
        accounts.add(new Account("A1"));
        accounts.add(new Account("A2"));

        Queue<Transaction> queue=new LinkedList<>();
        queue.add(new Transaction(1,"A1",500));
        queue.add(new Transaction(2,"A3",1000));
        queue.add(new Transaction(3,"A2",200));

        Stack<Transaction> stack=new Stack<>();

        while(!queue.isEmpty()){
            Transaction t=queue.remove();

            boolean valid=false;
            for(Account a:accounts){
                if(a.id.equals(t.accountId)){
                    valid=true;
                    break;
                }
            }

            if(valid){
                System.out.println("Processed: "+t);
                all.add(t);
                stack.push(t);
            }else{
                System.out.println("Invalid Account: "+t);
            }
        }

        if(!stack.isEmpty()){
            Transaction last=stack.pop();
            System.out.println("Rollback: "+last);
            all.remove(last);
        }

        System.out.println("Final Transactions: "+all);
    }
}