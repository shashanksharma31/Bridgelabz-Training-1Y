package MapInterface;
import java.util.*;

public class OnlineShoppingCartProductPriceSummary{
    public static void main(String[] args){

        LinkedHashMap<String,Double> cart=new LinkedHashMap<>();

        cart.put("Laptop",45000.0);
        cart.put("Headphones",2000.0);
        cart.put("Mouse",800.0);
        cart.put("Keyboard",1500.0);
        cart.put("USB Cable",300.0);

        System.out.println("Cart Items:");
        for(String item:cart.keySet()){
            System.out.println(item+" "+cart.get(item));
        }

        double total=0;

        for(String item:cart.keySet()){
            total=total+cart.get(item);
        }

        System.out.println("\nTotal Bill: "+total);

        if(total>5000){
            double discount=total*0.10;
            total=total-discount;
            System.out.println("Discount Applied: "+discount);
        }

        System.out.println("Final Payable Amount: "+total);

        String removeItem="Mouse";
        if(cart.containsKey(removeItem)){
            cart.remove(removeItem);
        }

        System.out.println("\nCart After Removal:");
        for(String item:cart.keySet()){
            System.out.println(item+" "+cart.get(item));
        }
    }
}