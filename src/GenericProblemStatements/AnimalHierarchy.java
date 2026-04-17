package GenericProblemStatements;
import java.util.*;
class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
}
class AnimalUtil{
    static void printAnimals(List<? extends Animal> animals){
        for(Animal a:animals){
            System.out.println(a.name);
        }
    }
}
public class AnimalHierarchy{
    public static void main(String[] args){
        List<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Dog1"));
        dogs.add(new Dog("Dog2"));
        AnimalUtil.printAnimals(dogs);
        List<Cat> cats=new ArrayList<>();
        cats.add(new Cat("Cat1"));
        cats.add(new Cat("Cat2"));
        AnimalUtil.printAnimals(cats);
    }
}