package src.com.gla.Lambda_Expressions;
import java.util.*;

class Product {
    String name;
    int price;
    Product(String n,int p){name=n;price=p;}
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("A",300));
        list.add(new Product("B",100));

        list.sort((p1,p2)->p1.price-p2.price);

        for(Product p:list) {
            System.out.println(p.name+" "+p.price);
        }
    }
}
