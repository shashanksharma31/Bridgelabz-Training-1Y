package.src.com.gla.SubmissionOfInheritance;

class Vehicle{int maxSpeed;String fuelType;void displayInfo(){System.out.println(maxSpeed+" "+fuelType);}}
class Car extends Vehicle{}
class Truck extends Vehicle{}
class Motorcycle extends Vehicle{}
public class VehicleSystem{public static void main(String[] args){Vehicle v=new Car();v.maxSpeed=120;v.fuelType="Petrol";v.displayInfo();}}