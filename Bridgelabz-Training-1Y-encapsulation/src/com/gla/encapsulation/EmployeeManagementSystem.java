package com.gla.encapsulation;


abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int hours;
    public PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }
    public double calculateSalary() {
        return getBaseSalary() * hours;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(2, "Aman", 500, 20);

        e1.displayDetails();
        e2.displayDetails();
    }
}
