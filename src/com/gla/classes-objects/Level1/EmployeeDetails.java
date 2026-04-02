package src.com.gla.classes-objects.Level1;


public class EmployeeDetails {
    String name;
    int id;
    double salary;

    EmployeeDetails(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args){
        EmployeeDetails emp = new EmployeeDetails("Rahul",101,50000);
        emp.displayDetails();
    }
}
