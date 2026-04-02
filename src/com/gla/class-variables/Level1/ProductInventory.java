package src.com.gla.classes-variables.Level1;


// Instance vs Class variable example
public class ProductInventory {

    String productName;
    double price;

    static int totalProducts=0;

    ProductInventory(String name,double price){
        this.productName=name;
        this.price=price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println(productName+" "+price);
    }

    static void displayTotalProducts(){
        System.out.println("Total Products: "+totalProducts);
    }

    public static void main(String[] args){
        ProductInventory p1=new ProductInventory("Laptop",50000);
        ProductInventory p2=new ProductInventory("Mouse",500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }
}
