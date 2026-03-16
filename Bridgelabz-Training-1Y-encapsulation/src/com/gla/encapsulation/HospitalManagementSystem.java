package com.gla.encapsulation;


interface MedicalRecord {
    void addRecord(String record);
}

abstract class Patient {
    private int patientId;
    private String name;

    public Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Name: " + name);
    }
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String name) {
        super(id, name);
    }
    public double calculateBill() {
        return 5000;
    }
    public void addRecord(String record) {
        System.out.println("Record Added: " + record);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Sita");
        p.getPatientDetails();
        System.out.println("Bill: " + p.calculateBill());
    }
}
