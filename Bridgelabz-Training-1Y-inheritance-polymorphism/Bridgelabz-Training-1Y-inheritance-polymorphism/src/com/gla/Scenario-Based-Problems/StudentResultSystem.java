package src.com.gla.Scenario-Based-Problems;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r,String n,int m) {
        rollNo=r;
        name=n;
        marks=m;
    }

    String calculateGrade() {
        if(marks>=80) return "A";
        else if(marks>=60) return "B";
        else return "C";
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int r,String n,int m,String b) {
        super(r,n,m);
        branch=b;
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        EngineeringStudent s=new EngineeringStudent(1,"Sameer",75,"CSE");

        System.out.println("Name: "+s.name+"-"+s.branch);
        System.out.println("Grade: "+s.calculateGrade());
    }
}
