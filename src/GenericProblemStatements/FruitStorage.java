package GenericProblemStatements;
class Fruit{
    String name;
    Fruit(String name){
        this.name=name;
    }
}
class Apple extends Fruit{
    Apple(String name){
        super(name);
    }
}
class Mango extends Fruit{
    Mango(String name){
        super(name);
    }
}
class FruitBox<T extends Fruit>{
    T item;
    void add(T item){
        this.item=item;
    }
    void display(){
        System.out.println(item.name);
    }
}
public class FruitStorage{
    public static void main(String[] args){
        FruitBox<Apple> b1=new FruitBox<>();
        b1.add(new Apple("Apple"));
        b1.display();
        FruitBox<Mango> b2=new FruitBox<>();
        b2.add(new Mango("Mango"));
        b2.display();
    }
}