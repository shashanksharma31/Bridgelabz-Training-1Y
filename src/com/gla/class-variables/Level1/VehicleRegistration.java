package src.com.gla.classes-variables.Level1;


// Vehicle registration example
public class VehicleRegistration {

    String ownerName;
    String vehicleType;

    static int registrationFee=2000;

    VehicleRegistration(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println(ownerName+" "+vehicleType+" Fee:"+registrationFee);
    }

    static void updateRegistrationFee(int fee){
        registrationFee=fee;
    }

    public static void main(String[] args){
        VehicleRegistration v=new VehicleRegistration("Aman","Bike");
        v.displayVehicleDetails();
    }
}
