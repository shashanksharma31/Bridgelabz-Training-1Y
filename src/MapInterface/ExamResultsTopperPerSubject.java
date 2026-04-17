package MapInterface;
import java.util.*;

public class ExamResultsTopperPerSubject{
    public static void main(String[] args){

        Map<String,Map<String,Integer>> map=new HashMap<>();

        map.put("Math",new HashMap<>());
        map.put("Science",new HashMap<>());
        map.put("English",new HashMap<>());

        map.get("Math").put("Amit",85);
        map.get("Math").put("Ravi",92);
        map.get("Math").put("Neha",78);

        map.get("Science").put("Amit",88);
        map.get("Science").put("Ravi",75);
        map.get("Science").put("Neha",91);

        map.get("English").put("Amit",90);
        map.get("English").put("Ravi",82);
        map.get("English").put("Neha",88);

        System.out.println("Topper per Subject:");

        for(String subject:map.keySet()){
            String topper="";
            int max=0;

            for(String student:map.get(subject).keySet()){
                int marks=map.get(subject).get(student);
                if(marks>max){
                    max=marks;
                    topper=student;
                }
            }

            System.out.println(subject+" -> "+topper+" "+max);
        }

        System.out.println("\nAverage per Subject:");

        for(String subject:map.keySet()){
            int sum=0;
            int count=0;

            for(String student:map.get(subject).keySet()){
                sum=sum+map.get(subject).get(student);
                count++;
            }

            System.out.println(subject+" -> "+(sum*1.0/count));
        }

        System.out.println("\nSubjects with any score > 90:");

        for(String subject:map.keySet()){
            boolean found=false;

            for(String student:map.get(subject).keySet()){
                if(map.get(subject).get(student)>90){
                    found=true;
                    break;
                }
            }

            if(found){
                System.out.println(subject);
            }
        }
    }
}