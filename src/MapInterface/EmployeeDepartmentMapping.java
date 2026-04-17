package MapInterface;
import java.util.*;

public class EmployeeDepartmentMapping{
    public static void main(String[] args){

        HashMap<Integer,String> map=new HashMap<>();

        map.put(101,"HR");
        map.put(102,"IT");
        map.put(103,"IT");
        map.put(104,"Finance");
        map.put(105,"HR");
        map.put(106,"Marketing");

        map.put(103,"Finance");

        String searchDept="IT";

        System.out.println("Employees in "+searchDept+":");
        for(Integer id:map.keySet()){
            if(map.get(id).equals(searchDept)){
                System.out.println(id);
            }
        }

        HashMap<String,Integer> count=new HashMap<>();

        for(Integer id:map.keySet()){
            String dept=map.get(id);
            if(count.containsKey(dept)){
                count.put(dept,count.get(dept)+1);
            }else{
                count.put(dept,1);
            }
        }

        System.out.println("\nEmployees per Department:");
        for(String dept:count.keySet()){
            System.out.println(dept+" "+count.get(dept));
        }
    }
}