package JavaCollection.ScenarioBased;
import java.util.*;

class Parcel{
    String id;
    int priority;
    String agent;

    Parcel(String id,int priority){
        this.id=id;
        this.priority=priority;
    }

    public String toString(){
        return id+" "+priority+" "+agent;
    }
}

class ParcelComparator implements Comparator<Parcel>{
    public int compare(Parcel p1,Parcel p2){
        return p2.priority-p1.priority;
    }
}

public class CourierDeliveryRoutingSystem{
    public static void main(String[] args){

        Set<String> assignedIds=new HashSet<>();
        Queue<Parcel> normalQueue=new LinkedList<>();
        PriorityQueue<Parcel> pq=new PriorityQueue<>(new ParcelComparator());
        List<Parcel> completed=new ArrayList<>();

        Parcel p1=new Parcel("D1",3);
        Parcel p2=new Parcel("D2",5);
        Parcel p3=new Parcel("D3",2);
        Parcel p4=new Parcel("D2",5);

        Parcel[] arr={p1,p2,p3,p4};

        for(Parcel p:arr){
            if(assignedIds.add(p.id)){
                pq.add(p);
                normalQueue.add(p);
            }
        }

        String[] agents={"A1","A2","A3"};
        int ai=0;

        while(!pq.isEmpty()){
            Parcel p=pq.remove();
            p.agent=agents[ai%agents.length];
            ai++;
            System.out.println("Delivering (Priority): "+p);
            completed.add(p);
        }

        while(!normalQueue.isEmpty()){
            Parcel p=normalQueue.remove();
            if(!completed.contains(p)){
                p.agent=agents[ai%agents.length];
                ai++;
                System.out.println("Delivering (Normal): "+p);
                completed.add(p);
            }
        }

        System.out.println("\nCompleted Deliveries:");
        for(Parcel p:completed){
            System.out.println(p);
        }
    }
}