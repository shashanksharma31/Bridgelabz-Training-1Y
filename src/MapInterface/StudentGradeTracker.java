package MapInterface;
import java.util.*;

public class StudentGradeTracker{
    public static void main(String[] args){

        Map<String,Double> map=new HashMap<>();

        map.put("Amit",85.5);
        map.put("Ravi",70.0);
        map.put("Neha",92.0);
        map.put("Sita",60.0);

        map.put("Ravi",78.0);

        map.remove("Sita");

        Map<String,Double> sorted=new TreeMap<>(map);

        for(String name:sorted.keySet()){
            System.out.println(name+" "+sorted.get(name));
        }
    }
}