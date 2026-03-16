package com.gla.encapsulation;


interface GPS {
    void getCurrentLocation();
}

abstract class VehicleRide {
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String driver, double rate) {
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);
}

class CarRide extends VehicleRide implements GPS {
    public CarRide(String driver, double rate) {
        super(driver, rate);
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public void getCurrentLocation() {
        System.out.println("Location Updated");
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        VehicleRide ride = new CarRide("Mohit", 15);
        System.out.println("Fare: " + ride.calculateFare(10));
    }
}
