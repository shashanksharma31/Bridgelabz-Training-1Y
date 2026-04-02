package src.com.gla.classes-variables.Level1;


// Course class example
public class CourseManagement {

    String courseName;
    int duration;
    double fee;

    static String instituteName="GLA University";

    CourseManagement(String name,int duration,double fee){
        this.courseName=name;
        this.duration=duration;
        this.fee=fee;
    }

    void displayCourseDetails(){
        System.out.println(courseName+" "+duration+" "+fee+" "+instituteName);
    }

    static void updateInstituteName(String name){
        instituteName=name;
    }

    public static void main(String[] args){
        CourseManagement c=new CourseManagement("Java",3,5000);
        c.displayCourseDetails();
    }
}
