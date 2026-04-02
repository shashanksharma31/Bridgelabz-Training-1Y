package src.com.gla.classes-objects.package-assignment;


// Program 6: Employee management example
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    double getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }
}

class Payroll{
    double calculateBonus(Employee e){
        return e.getSalary() * 0.10;
    }
}

public class EmployeeManagementPackages{
    public static void main(String[] args){

        Employee e = new Employee(1,"Rahul","IT",50000);
        Payroll p = new Payroll();

        double bonus = p.calculateBonus(e);

        System.out.println("Employee: " + e.getName());
        System.out.println("Bonus: " + bonus);
    }
}
