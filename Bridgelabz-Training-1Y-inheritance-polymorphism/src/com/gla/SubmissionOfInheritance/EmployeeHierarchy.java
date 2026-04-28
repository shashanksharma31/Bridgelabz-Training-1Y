package.src.com.gla.SubmissionOfInheritance;

class Employee{String name;int id;double salary;void displayDetails(){System.out.println(name+" "+id+" "+salary);}}
class Manager extends Employee{int teamSize;}
class Developer extends Employee{String language;}
class Intern extends Employee{int duration;}
public class EmployeeHierarchy{public static void main(String[] args){Manager m=new Manager();m.name="Rahul";m.id=1;m.salary=50000;m.displayDetails();}}