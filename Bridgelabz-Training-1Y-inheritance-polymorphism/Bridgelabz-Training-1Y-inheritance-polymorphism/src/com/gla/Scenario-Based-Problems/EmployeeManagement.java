package src.com.gla.Scenario-Based-Problems;

class Employee {
    int empId;
    String name;

    Employee(int id,String name) {
        this.empId=id;
        this.name=name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {
    String department;

    Manager(int id,String name,String dept) {
        super(id,name);
        department=dept;
    }

    String generateEmail() {
        return name.toLowerCase()+"."+department.toLowerCase()+"@company.com";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Sameer");
        System.out.println(e1.generateEmail());

        Employee e2=new Manager(2,"Rahul","HR");
        System.out.println(e2.generateEmail());
    }
}
