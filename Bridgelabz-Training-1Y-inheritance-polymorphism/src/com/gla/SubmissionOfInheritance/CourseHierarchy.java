package.src.com.gla.SubmissionOfInheritance;

class Course{String name;}
class OnlineCourse extends Course{}
class PaidOnlineCourse extends OnlineCourse{double fee;void show(){System.out.println(name+" "+fee);}}
public class CourseHierarchy{public static void main(String[] args){PaidOnlineCourse c=new PaidOnlineCourse();c.name="Java";c.fee=5000;c.show();}}