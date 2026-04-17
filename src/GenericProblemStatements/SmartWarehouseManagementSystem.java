package GenericProblemStatements;
import java.util.*;
abstract class WarehouseItem{
    String name;
    WarehouseItem(String name){
        this.name=name;
    }
}
class Electronic extends WarehouseItem{
    Electronic(String name){
        super(name);
    }
}
class Groceries extends WarehouseItem{
    Groceries(String name){
        super(name);
    }
}
class Furniture extends WarehouseItem{
    Furniture(String name){
        super(name);
    }
}
class Storage<T extends WarehouseItem>{
    List<T> list=new ArrayList<>();
    void addItem(T item){
        list.add(item);
    }
    List<T> getItems(){
        return list;
    }
}
class WarehouseUtil{
    static void displayAll(List<? extends WarehouseItem> items){
        for(WarehouseItem w:items){
            System.out.println(w.name);
        }
    }
}
public class SmartWarehouseManagementSystem{
    public static void main(String[] args){
        Storage<Electronic> s1=new Storage<>();
        s1.addItem(new Electronic("TV"));
        s1.addItem(new Electronic("Laptop"));
        Storage<Groceries> s2=new Storage<>();
        s2.addItem(new Groceries("Rice"));
        s2.addItem(new Groceries("Milk"));
        Storage<Furniture> s3=new Storage<>();
        s3.addItem(new Furniture("Chair"));
        s3.addItem(new Furniture("Table"));
        WarehouseUtil.displayAll(s1.getItems());
        WarehouseUtil.displayAll(s2.getItems());
        WarehouseUtil.displayAll(s3.getItems());
    }
}