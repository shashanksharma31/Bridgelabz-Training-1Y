package.src.com.gla.SubmissionOfInheritance;

class Person{String name;}
class Teacher extends Person{}
class Student extends Person{}
class Staff extends Person{}
public class SchoolRoles{public static void main(String[] args){Teacher t=new Teacher();t.name="Sharma";System.out.println(t.name);}}