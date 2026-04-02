package src.com.gla.classes-objects.Level1;


public class StudentReport {

    String name;
    int rollNumber;
    int marks;

    StudentReport(String name,int rollNumber,int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade(){
        if(marks>=90) return "A";
        else if(marks>=75) return "B";
        else if(marks>=60) return "C";
        else return "Fail";
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args){
        StudentReport s = new StudentReport("Aman",12,82);
        s.display();
    }
}
