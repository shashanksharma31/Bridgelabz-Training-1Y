package src.com.gla.Scenario-Based-Problems;

class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName="LearnOnline";

    Course(int id,String name,double price) {
        courseId=id;
        courseName=name;
        this.price=price;
    }

    double getFinalPrice() {
        return price;
    }
}

class RecordedCourse extends Course {
    RecordedCourse(int id,String name,double price) {
        super(id,name,price);
    }

    double getFinalPrice() {
        return price - (price*0.10);
    }
}

class LiveCourse extends Course {
    LiveCourse(int id,String name,double price) {
        super(id,name,price);
    }

    double getFinalPrice() {
        return price - (price*0.05);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course c;

        c=new RecordedCourse(1,"Java Course",2000);
        System.out.println("Recorded Price: "+c.getFinalPrice());

        c=new LiveCourse(2,"Python Course",2000);
        System.out.println("Live Price: "+c.getFinalPrice());
    }
}
