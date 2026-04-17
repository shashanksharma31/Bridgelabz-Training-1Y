package GenericProblemStatements;
import java.util.*;
class BookCategory{
    String type;
    BookCategory(String type){
        this.type=type;
    }
}
class ClothingCategory{
    String type;
    ClothingCategory(String type){
        this.type=type;
    }
}
class GadgetCategory{
    String type;
    GadgetCategory(String type){
        this.type=type;
    }
}
class Products<T>{
    String name;
    double price;
    T category;
    Products(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    public String toString(){
        return name+" "+price;
    }
}
class MarketplaceUtil{
    static <T extends Products<?>> void applyDiscount(T product,double percentage){
        double p=product.getPrice();
        p=p-(p*percentage/100);
        product.setPrice(p);
    }
}
public class DynamicOnlineMarketplace{
    public static void main(String[] args){
        Products<BookCategory> b1=new Products<>("JavaBook",500,new BookCategory("Education"));
        Products<ClothingCategory> c1=new Products<>("Shirt",1000,new ClothingCategory("Men"));
        Products<GadgetCategory> g1=new Products<>("Phone",20000,new GadgetCategory("Electronics"));
        List<Products<?>> list=new ArrayList<>();
        list.add(b1);
        list.add(c1);
        list.add(g1);
        MarketplaceUtil.applyDiscount(b1,10);
        MarketplaceUtil.applyDiscount(c1,20);
        MarketplaceUtil.applyDiscount(g1,5);
        for(Products<?> p:list){
            System.out.println(p);
        }
    }
}