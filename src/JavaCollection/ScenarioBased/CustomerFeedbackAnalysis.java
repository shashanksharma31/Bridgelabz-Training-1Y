package JavaCollection.ScenarioBased;
import java.util.*;

public class CustomerFeedbackAnalysis{
    public static void main(String[] args){

        List<String> feedback=new ArrayList<>();
        feedback.add("Good service");
        feedback.add("Nice app");
        feedback.add("Good service");
        feedback.add("Very fast");
        feedback.add("Nice app");

        Set<String> unique=new HashSet<>(feedback);

        Queue<String> queue=new LinkedList<>(unique);

        Stack<String> stack=new Stack<>();

        System.out.println("Processing Feedback:");

        while(!queue.isEmpty()){
            String f=queue.remove();
            System.out.println(f);
            stack.push(f);
        }

        System.out.println("\nRecent Feedbacks:");

        int count=0;
        while(!stack.isEmpty() && count<3){
            System.out.println(stack.pop());
            count++;
        }
    }
}