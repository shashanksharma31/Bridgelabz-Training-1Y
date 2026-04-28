package.src.com.gla.SubmissionOfInheritance;

interface Refuelable{void refuel();}
class PetrolVehicle implements Refuelable{public void refuel(){System.out.println("Refuel");}}
class ElectricVehicle{void charge(){System.out.println("Charge");}}
public class VehicleHybrid{public static void main(String[] args){PetrolVehicle p=new PetrolVehicle();p.refuel();}}