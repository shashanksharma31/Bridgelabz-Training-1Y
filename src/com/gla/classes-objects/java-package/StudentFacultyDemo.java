package src.com.gla.classes-objects.package-assignment;


// Program 1: Student and Faculty example
class Student{
    void displayStudent(){
        System.out.println("Student Name: Rahul");
        System.out.println("Roll Number: 101");
    }
}

class Faculty{
    void displayFaculty(){
        System.out.println("Faculty Name: Dr. Sharma");
        System.out.println("Subject: Java Programming");
    }
}

public class StudentFacultyDemo{
    public static void main(String[] args){
        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        f.displayFaculty();
    }
}
