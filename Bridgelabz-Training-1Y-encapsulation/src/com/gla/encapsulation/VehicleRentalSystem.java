package com.gla.encapsulation;


interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String number, double rate) {
        this.vehicleNumber = number;
        this.rentalRate = rate;
    }

    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, rate);
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 500;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v = new Car("UP32AB1234", 2000);
        System.out.println("Rental: " + v.calculateRentalCost(3));
        System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
    }
}
