package JavaCollection.ScenarioBased;
import java.util.*;
class Order{
    int id;
    String name;
    Order(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Order ord=(Order)o;
        return id==ord.id;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class ECommerceOrderProcessingSystem{
    public static void main(String[] args){
        List<Order> list=new ArrayList<>();
        list.add(new Order(1,"Phone"));
        list.add(new Order(2,"Laptop"));
        list.add(new Order(1,"Phone"));
        list.add(new Order(3,"Shoes"));

        Set<Order> set=new HashSet<>(list);

        Queue<Order> queue=new LinkedList<>();
        for(Order o:set){
            queue.add(o);
        }

        Stack<Order> stack=new Stack<>();

        while(!queue.isEmpty()){
            Order o=queue.remove();
            if(o.id==2){
                stack.push(o);
            }else{
                System.out.println("Processed: "+o);
            }
        }

        while(!stack.isEmpty()){
            Order o=stack.pop();
            System.out.println("Reprocessing: "+o);
        }
    }
}