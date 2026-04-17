package JavaCollection.ScenarioBased;
import java.util.*;
class RideRequest{
    String name;
    int priority;
    RideRequest(String name,int priority){
        this.name=name;
        this.priority=priority;
    }
    public String toString(){
        return name+" "+priority;
    }
}
class Driver{
    String name;
    Driver(String name){
        this.name=name;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Driver d=(Driver)o;
        return name.equals(d.name);
    }
    public String toString(){
        return name;
    }
}
class Ride{
    String rider;
    String driver;
    Ride(String rider,String driver){
        this.rider=rider;
        this.driver=driver;
    }
    public String toString(){
        return rider+" "+driver;
    }
}
class RideComparator implements Comparator<RideRequest>{
    public int compare(RideRequest r1,RideRequest r2){
        return r2.priority-r1.priority;
    }
}
public class RideSharingDispatchSystem{
    public static void main(String[] args){
        Queue<RideRequest> queue=new LinkedList<>();
        queue.add(new RideRequest("A",1));
        queue.add(new RideRequest("B",2));

        PriorityQueue<RideRequest> pq=new PriorityQueue<>(new RideComparator());
        pq.addAll(queue);

        Set<Driver> drivers=new HashSet<>();
        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));

        List<Ride> history=new ArrayList<>();

        while(!pq.isEmpty() && !drivers.isEmpty()){
            RideRequest r=pq.remove();
            Driver d=drivers.iterator().next();
            drivers.remove(d);
            System.out.println("Assigned: "+r+" -> "+d);
            history.add(new Ride(r.name,d.name));
        }

        for(Ride r:history){
            System.out.println("Completed: "+r);
        }
    }
}