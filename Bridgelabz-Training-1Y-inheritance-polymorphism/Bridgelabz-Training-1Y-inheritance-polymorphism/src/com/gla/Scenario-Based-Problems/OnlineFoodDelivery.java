package src.com.gla.Scenario-Based-Problems;

class Order {
    int orderId;
    double baseAmount;
    static int deliveryCharge = 40;

    Order(int id,double amount) {
        orderId=id;
        baseAmount=amount;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {
    RegularOrder(int id,double amount) {
        super(id,amount);
    }
}

class PremiumOrder extends Order {
    PremiumOrder(int id,double amount) {
        super(id,amount);
    }

    double calculateBill() {
        double discount = baseAmount * 0.20;
        return baseAmount - discount + deliveryCharge;
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        Order o;

        o = new RegularOrder(1,500);
        System.out.println("Regular Bill: " + o.calculateBill());

        o = new PremiumOrder(2,500);
        System.out.println("Premium Bill: " + o.calculateBill());
    }
}
