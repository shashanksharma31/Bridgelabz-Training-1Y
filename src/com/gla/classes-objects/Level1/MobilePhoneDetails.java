package src.com.gla.classes-objects.Level1;


public class MobilePhoneDetails {

    String brand;
    String model;
    double price;

    MobilePhoneDetails(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args){
        MobilePhoneDetails phone = new MobilePhoneDetails("Samsung","S21",65000);
        phone.displayDetails();
    }
}
