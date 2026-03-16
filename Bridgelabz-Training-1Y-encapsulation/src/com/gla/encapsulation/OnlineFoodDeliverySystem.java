package com.gla.encapsulation;


interface Discountable {
    double applyDiscount();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item = new VegItem("Paneer", 200, 2);
        System.out.println("Total: " + item.calculateTotalPrice());
    }
}
