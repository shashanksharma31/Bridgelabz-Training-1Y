package src.com.gla.classes-objects.Level1;


public class ShoppingCart {

    String itemName;
    double price;
    int quantity;

    ShoppingCart(String itemName,double price,int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int q){
        quantity += q;
    }

    void removeItem(int q){
        if(quantity >= q){
            quantity -= q;
        }
    }

    double totalCost(){
        return price * quantity;
    }

    void display(){
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart("Laptop",50000,1);
        cart.addItem(1);
        cart.display();
    }
}
