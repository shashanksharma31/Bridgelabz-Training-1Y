package GenericProblemStatements;
import java.util.*;
class Product{
    double price;
    Product(double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }
}
class Mobile extends Product{
    Mobile(double price){
        super(price);
    }
}
class Laptop extends Product{
    Laptop(double price){
        super(price);
    }
}
class PriceUtil{
    static double calculateTotal(List<? extends Product> items){
        double sum=0;
        for(Product p:items){
            sum=sum+p.getPrice();
        }
        return sum;
    }
}
public class PriceCalculator{
    public static void main(String[] args){
        List<Mobile> mlist=new ArrayList<>();
        mlist.add(new Mobile(10000));
        mlist.add(new Mobile(20000));
        System.out.println(PriceUtil.calculateTotal(mlist));
        List<Laptop> llist=new ArrayList<>();
        llist.add(new Laptop(50000));
        llist.add(new Laptop(70000));
        System.out.println(PriceUtil.calculateTotal(llist));
    }
}