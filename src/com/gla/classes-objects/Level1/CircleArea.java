package src.com.gla.classes-objects.Level1;


public class CircleArea {

    double radius;

    CircleArea(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14 * radius * radius;
    }

    double calculateCircumference(){
        return 2 * 3.14 * radius;
    }

    void display(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args){
        CircleArea c = new CircleArea(5);
        c.display();
    }
}
