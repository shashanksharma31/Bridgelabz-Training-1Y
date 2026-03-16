package com.gla.encapsulation;


interface Taxable {
    double calculateTax();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p = new Electronics(1, "Laptop", 50000);
        double finalPrice = p.getPrice() + ((Taxable)p).calculateTax() - p.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }
}
