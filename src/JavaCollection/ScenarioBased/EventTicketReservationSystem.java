package JavaCollection.ScenarioBased;
import java.util.*;

class Booking{
    String user;
    boolean vip;
    int id;

    Booking(int id,String user,boolean vip){
        this.id=id;
        this.user=user;
        this.vip=vip;
    }

    public String toString(){
        return id+" "+user+" "+vip;
    }
}

class VipComparator implements Comparator<Booking>{
    public int compare(Booking b1,Booking b2){
        if(b1.vip==b2.vip){
            return b1.id-b2.id;
        }
        return b1.vip ? -1 : 1;
    }
}

public class EventTicketReservationSystem{
    public static void main(String[] args){

        Set<String> users=new HashSet<>();
        List<Booking> bookings=new ArrayList<>();
        Queue<Booking> queue=new LinkedList<>();
        PriorityQueue<Booking> pq=new PriorityQueue<>(new VipComparator());

        Booking b1=new Booking(1,"Amit",false);
        Booking b2=new Booking(2,"Ravi",true);
        Booking b3=new Booking(3,"Neha",false);
        Booking b4=new Booking(4,"Amit",false);

        Booking[] arr={b1,b2,b3,b4};

        for(Booking b:arr){
            if(users.add(b.user)){
                queue.add(b);
                pq.add(b);
            }
        }

        while(!pq.isEmpty()){
            Booking b=pq.remove();
            System.out.println("Confirming VIP priority: "+b);
            bookings.add(b);
        }

        while(!queue.isEmpty()){
            Booking b=queue.remove();
            if(!bookings.contains(b)){
                System.out.println("Confirming normal: "+b);
                bookings.add(b);
            }
        }

        System.out.println("\nFinal Bookings:");
        for(Booking b:bookings){
            System.out.println(b);
        }
    }
}