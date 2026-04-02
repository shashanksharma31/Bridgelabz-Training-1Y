package src.com.gla.classes-objects.Level1;


public class ItemInventory {

    int itemCode;
    String itemName;
    double price;

    ItemInventory(int itemCode,String itemName,double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int quantity){
        return price * quantity;
    }

    void displayItem(int quantity){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + totalCost(quantity));
    }

    public static void main(String[] args){
        ItemInventory item = new ItemInventory(1,"Pen",10);
        item.displayItem(5);
    }
}
