package src.com.gla.classes-variables.Level1;


// Program 2: Circle using constructor chaining
public class CircleConstructorChaining {

    double radius;

    CircleConstructorChaining(){
        this(5); // call parameterized constructor
    }

    CircleConstructorChaining(double radius){
        this.radius=radius;
    }

    double area(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args){
        CircleConstructorChaining c1=new CircleConstructorChaining();
        CircleConstructorChaining c2=new CircleConstructorChaining(10);

        System.out.println("Area1: "+c1.area());
        System.out.println("Area2: "+c2.area());
    }
}
