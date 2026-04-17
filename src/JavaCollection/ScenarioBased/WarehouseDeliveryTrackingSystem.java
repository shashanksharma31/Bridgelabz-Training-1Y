package JavaCollection.ScenarioBased;
import java.util.*;

class Package{
    String id;
    String destination;
    Package(String id,String destination){
        this.id=id;
        this.destination=destination;
    }
    public String toString(){
        return id+" "+destination;
    }
}

public class WarehouseDeliveryTrackingSystem{
    public static void main(String[] args){

        Set<String> ids=new HashSet<>();
        Queue<Package> pending=new LinkedList<>();
        List<Package> delivered=new ArrayList<>();
        Stack<Package> returned=new Stack<>();

        Package p1=new Package("P1","Delhi");
        Package p2=new Package("P2","Mumbai");
        Package p3=new Package("P3","Jaipur");
        Package p4=new Package("P2","Mumbai");

        Package[] arr={p1,p2,p3,p4};

        for(Package p:arr){
            if(ids.add(p.id)){
                pending.add(p);
            }
        }

        while(!pending.isEmpty()){
            Package p=pending.remove();

            if(p.id.equals("P3")){
                System.out.println("Returned: "+p);
                returned.push(p);
            }else{
                System.out.println("Delivered: "+p);
                delivered.add(p);
            }
        }

        System.out.println("\nDelivered Packages:");
        for(Package p:delivered){
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        for(Package p:returned){
            System.out.println(p);
        }
    }
}