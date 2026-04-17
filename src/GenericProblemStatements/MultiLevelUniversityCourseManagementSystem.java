package GenericProblemStatements;
import java.util.*;
abstract class CourseType{
    String type;
    CourseType(String type){
        this.type=type;
    }
}
class ExamCourse extends CourseType{
    ExamCourse(String type){
        super(type);
    }
}
class AssignmentCourse extends CourseType{
    AssignmentCourse(String type){
        super(type);
    }
}
class ResearchCourse extends CourseType{
    ResearchCourse(String type){
        super(type);
    }
}
class Course<T extends CourseType>{
    String name;
    T courseType;
    Course(String name,T courseType){
        this.name=name;
        this.courseType=courseType;
    }
}
class CourseUtil{
    static void displayCourses(List<? extends CourseType> list){
        for(CourseType c:list){
            System.out.println(c.type);
        }
    }
}
public class MultiLevelUniversityCourseManagementSystem{
    public static void main(String[] args){
        List<ExamCourse> l1=new ArrayList<>();
        l1.add(new ExamCourse("Math"));
        l1.add(new ExamCourse("Physics"));
        CourseUtil.displayCourses(l1);
        List<AssignmentCourse> l2=new ArrayList<>();
        l2.add(new AssignmentCourse("Java"));
        l2.add(new AssignmentCourse("DBMS"));
        CourseUtil.displayCourses(l2);
        List<ResearchCourse> l3=new ArrayList<>();
        l3.add(new ResearchCourse("AI"));
        l3.add(new ResearchCourse("ML"));
        CourseUtil.displayCourses(l3);
    }
}