package GenericProblemStatements;
import java.util.*;
class Vehicle{
    String name;
    Vehicle(String name){
        this.name=name;
    }
}
class Truck extends Vehicle{
    Truck(String name){
        super(name);
    }
}
class Bike extends Vehicle{
    Bike(String name){
        super(name);
    }
}
class FleetManager<T extends Vehicle>{
    List<T> list=new ArrayList<>();
    void addVehicle(T vehicle){
        list.add(vehicle);
    }
    void showFleet(){
        for(T v:list){
            System.out.println(v.name);
        }
    }
}
public class GenericFleetManager{
    public static void main(String[] args){
        FleetManager<Truck> f1=new FleetManager<>();
        f1.addVehicle(new Truck("Truck1"));
        f1.addVehicle(new Truck("Truck2"));
        f1.showFleet();
        FleetManager<Bike> f2=new FleetManager<>();
        f2.addVehicle(new Bike("Bike1"));
        f2.addVehicle(new Bike("Bike2"));
        f2.showFleet();
    }
}