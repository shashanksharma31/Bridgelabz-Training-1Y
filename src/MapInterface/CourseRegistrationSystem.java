package MapInterface;
import java.util.*;

public class CourseRegistrationSystem{
    public static void main(String[] args){

        Map<String,Integer> map=new HashMap<>();

        map.put("CS101",48);
        map.put("CS102",3);
        map.put("CS103",60);
        map.put("CS104",10);
        map.put("CS105",55);

        String courseAdd="CS101";
        map.put(courseAdd,map.get(courseAdd)+5);

        String courseDrop="CS104";
        if(map.containsKey(courseDrop)){
            int val=map.get(courseDrop)-7;
            if(val<0){
                map.put(courseDrop,0);
            }else{
                map.put(courseDrop,val);
            }
        }

        System.out.println("Near Full Courses:");
        for(String c:map.keySet()){
            if(map.get(c)>=50){
                System.out.println(c+" "+map.get(c));
            }
        }

        System.out.println("\nUnder Subscribed Courses:");
        for(String c:map.keySet()){
            if(map.get(c)<5){
                System.out.println(c+" "+map.get(c));
            }
        }
    }
}