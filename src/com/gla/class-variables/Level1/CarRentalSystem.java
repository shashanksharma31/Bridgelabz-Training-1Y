package src.com.gla.classes-variables.Level1;


// Program 6: Car rental system
public class CarRentalSystem {

    String customerName;
    String carModel;
    int rentalDays;

    CarRentalSystem(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }

    int calculateCost(){
        int pricePerDay=1000;
        return rentalDays*pricePerDay;
    }

    public static void main(String[] args){
        CarRentalSystem c=new CarRentalSystem("Ravi","Swift",3);
        System.out.println("Total Cost: "+c.calculateCost());
    }
}
