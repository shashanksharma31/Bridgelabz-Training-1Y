package JavaCollection.ScenarioBased;
import java.util.*;
class Question{
    int id;
    String text;
    Question(int id,String text){
        this.id=id;
        this.text=text;
    }
    public String toString(){
        return id+" "+text;
    }
}
class Student{
    String id;
    String name;
    Student(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class OnlineExaminationManagementSystem{
    public static void main(String[] args){
        List<Question> questions=new ArrayList<>();
        questions.add(new Question(1,"Q1"));
        questions.add(new Question(2,"Q2"));
        questions.add(new Question(3,"Q3"));
        Collections.shuffle(questions);

        Set<String> studentsId=new HashSet<>();
        studentsId.add("S1");
        studentsId.add("S2");
        studentsId.add("S1");

        Queue<Student> queue=new LinkedList<>();
        queue.add(new Student("S1","Amit"));
        queue.add(new Student("S2","Ravi"));

        Stack<Question> stack=new Stack<>();

        while(!queue.isEmpty()){
            Student s=queue.remove();
            System.out.println("Serving: "+s);
            for(Question q:questions){
                System.out.println("Question: "+q);
                stack.push(q);
            }
            while(!stack.isEmpty()){
                Question q=stack.pop();
                System.out.println("Back to: "+q);
            }
        }
    }
}