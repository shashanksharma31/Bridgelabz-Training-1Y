package JavaCollection.ScenarioBased;
import java.util.*;
class Product{
    String name;
    double price;
    int stock;
    Product(String name,double price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public String toString(){
        return name+" "+price+" "+stock;
    }
}
public class InventoryAndRestockManagementSystem{
    public static void main(String[] args){
        Set<String> set=new HashSet<>();
        List<Product> list=new ArrayList<>();
        Queue<Product> queue=new LinkedList<>();
        Stack<Product> stack=new Stack<>();

        Product p1=new Product("Milk",50,2);
        Product p2=new Product("Bread",30,10);
        Product p3=new Product("Rice",100,1);
        Product p4=new Product("Soap",40,5);

        Product[] arr={p1,p2,p3,p4};

        for(Product p:arr){
            if(set.add(p.name)){
                list.add(p);
            }
        }

        for(Product p:list){
            if(p.stock<=2){
                queue.add(p);
            }
        }

        while(!queue.isEmpty()){
            Product p=queue.remove();
            System.out.println("Restocking: "+p.name);
            p.stock+=10;
            stack.push(p);
        }

        if(!stack.isEmpty()){
            Product last=stack.pop();
            System.out.println("Undo Restock: "+last.name);
            last.stock-=10;
        }

        System.out.println("\nFinal Inventory:");
        for(Product p:list){
            System.out.println(p);
        }
    }
}