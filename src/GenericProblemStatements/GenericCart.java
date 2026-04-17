package GenericProblemStatements;
import java.util.*;
class Cart<T>{
    List<T> items=new ArrayList<>();
    void addItem(T item){
        items.add(item);
    }
    void removeItem(T item){
        items.remove(item);
    }
    void displayItems(){
        for(T i:items){
            System.out.println(i);
        }
    }
}
class Electronics{
    String name;
    Electronics(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
class Clothing{
    String name;
    Clothing(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
public class GenericCart{
    public static void main(String[] args){
        Cart<Electronics> c1=new Cart<>();
        c1.addItem(new Electronics("Laptop"));
        c1.addItem(new Electronics("Phone"));
        c1.displayItems();
        Cart<Clothing> c2=new Cart<>();
        c2.addItem(new Clothing("Shirt"));
        c2.addItem(new Clothing("Jeans"));
        c2.displayItems();
    }
}