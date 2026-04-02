package src.com.gla.classes-objects.package-assignment;


// Program 2: Course example (package hierarchy concept)
class Course{
    void showCourse(){
        System.out.println("Course: B.Tech Computer Science");
    }
}

public class CoursePackageHierarchy{
    public static void main(String[] args){
        Course c = new Course();
        c.showCourse();
    }
}
