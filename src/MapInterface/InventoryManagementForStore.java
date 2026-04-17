package MapInterface;
import java.util.*;

public class InventoryManagementForStore{
    public static void main(String[] args){

        Map<String,Integer> stock=new HashMap<>();

        stock.put("Rice",10);
        stock.put("Sugar",5);
        stock.put("Milk",8);

        String buyItem="Sugar";
        int buyQty=6;

        if(stock.containsKey(buyItem)){
            int q=stock.get(buyItem);
            q=q-buyQty;
            if(q<=0){
                stock.remove(buyItem);
            }else{
                stock.put(buyItem,q);
            }
        }

        String newShipment="Rice";
        int addQty=5;

        if(stock.containsKey(newShipment)){
            stock.put(newShipment,stock.get(newShipment)+addQty);
        }

        String query="Milk";
        if(stock.containsKey(query)){
            System.out.println(query+" remaining: "+stock.get(query));
        }else{
            System.out.println("not stocked");
        }

        System.out.println("\nOut of stock items:");
        for(String key:stock.keySet()){
            if(stock.get(key)==0){
                System.out.println(key);
            }
        }

        System.out.println("\nFinal Stock:");
        for(String key:stock.keySet()){
            System.out.println(key+" "+stock.get(key));
        }
    }
}