package src.com.gla.classes-variables.Level1;


// Access modifier example
class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }

    public double getCgpa(){
        return cgpa;
    }
}

class PostgraduateStudent extends Student{

    void display(){
        System.out.println("Roll: "+rollNumber);
        System.out.println("Name: "+name);
    }
}

public class StudentAccessModifier{
    public static void main(String[] args){
        PostgraduateStudent s=new PostgraduateStudent();
        s.rollNumber=10;
        s.name="Rahul";
        s.setCgpa(8.5);

        s.display();
        System.out.println("CGPA: "+s.getCgpa());
    }
}
