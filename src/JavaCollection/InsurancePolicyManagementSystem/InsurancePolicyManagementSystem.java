package JavaCollection.InsurancePolicyManagementSystem;
import java.util.*;
class Policy{
    int policyNumber;
    String name;
    String expiry;
    String coverage;
    double premium;
    Policy(int policyNumber,String name,String expiry,String coverage,double premium){
        this.policyNumber=policyNumber;
        this.name=name;
        this.expiry=expiry;
        this.coverage=coverage;
        this.premium=premium;
    }
    public int hashCode(){
        return policyNumber;
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Policy p=(Policy)o;
        return policyNumber==p.policyNumber;
    }
    public String toString(){
        return policyNumber+" "+name+" "+expiry+" "+coverage+" "+premium;
    }
}
class PolicyManager{
    HashSet<Policy> hset=new HashSet<>();
    LinkedHashSet<Policy> lset=new LinkedHashSet<>();
    TreeSet<Policy> tset=new TreeSet<>(new Comparator<Policy>(){
        public int compare(Policy p1,Policy p2){
            return p1.expiry.compareTo(p2.expiry);
        }
    });
    void addPolicy(Policy p){
        hset.add(p);
        lset.add(p);
        tset.add(p);
    }
    void displayAll(){
        System.out.println(hset);
        System.out.println(lset);
        System.out.println(tset);
    }
}
public class InsurancePolicyManagementSystem{
    public static void main(String[] args){
        PolicyManager pm=new PolicyManager();
        pm.addPolicy(new Policy(1,"Amit","2026-05-10","Health",1000));
        pm.addPolicy(new Policy(2,"Ravi","2026-04-20","Auto",2000));
        pm.addPolicy(new Policy(3,"Sita","2026-06-15","Home",1500));
        pm.addPolicy(new Policy(1,"Amit","2026-05-10","Health",1000));
        pm.displayAll();
    }
}